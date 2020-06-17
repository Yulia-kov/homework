package kursach;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server {
    private int port;
    private Connection connection;
    CopyOnWriteArrayList<Socket> socketList = new CopyOnWriteArrayList<>();
    ArrayBlockingQueue<Connection> messages = new ArrayBlockingQueue<Connection>(10000, true);
    CopyOnWriteArrayList<Connection> connections = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Thread> allReaders = new CopyOnWriteArrayList<>();
    Connection check;
    private Message mes2;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException, ClassNotFoundException, InterruptedException {


        Writer writer = new Writer();
        writer.start();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен. Введите сообщение.");
            while (true) {
                Socket clientSocket = serverSocket.accept();

                connection = new Connection(clientSocket);
                socketList.addIfAbsent(clientSocket);


                System.out.println(socketList);
                Reader reader = new Reader();
                reader.start();
                reader.setName(clientSocket.toString());
                allReaders.addIfAbsent(reader);

                System.out.println("Reader Name:  " + reader.getName() + " " + reader.getState());
                //System.out.println("LOOK " + allReaders);
                //System.out.println(reader.getName() + " " + reader.getState());
                //System.out.println("socketList " + socketList);

                //
                Iterator<Socket> socketCon = socketList.listIterator();
                while (socketCon.hasNext()) {
                    if (socketCon.next().isConnected() == false) {
                        System.out.println("FALSE");
                        socketCon.next().close();
                        for (Thread allR : allReaders) {
                            if (allR.getName().equalsIgnoreCase(socketCon.toString())) {
                                allR.interrupt();
                                System.out.println(allR.isInterrupted());
                            }
                        }
                        socketList.remove(socketCon);
                    }
                }

                writer.sleep(500);
                writer.send();





            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        int port = 8099;
        Server server = new Server(port);
        try {
            server.start();
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }

    }


    class Reader extends Thread {

        @Override
        public void run() {
            try {
                messages.put(connection);
                connections.addIfAbsent(connection);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


    class Writer extends Thread {


        @Override
        public void run() {
            Thread.currentThread().setName("Writer");
            System.out.println(Thread.currentThread().getName() + ": " +
                    Thread.currentThread().getState());

        }

        public void send() {

            try {
                 check = messages.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try {
                mes2 = messages.take().readMessage();
            } catch (IOException | ClassNotFoundException | InterruptedException e) {
                e.printStackTrace();
            }



            System.out.println("con " + connections);
            for (Connection con : connections) {
                if (con!=check) { // отсылаем всем кроме отправителя
                    try {
                        con.sendMessage(mes2);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                  connections.remove(con); // тк при каждом сообщении от клиента создается новое соеднинение

            }

        }


    }
}
