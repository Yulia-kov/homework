package fitnessTask;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Fitness {
    Membership[] all = new Membership[60];
    Membership[] gym = new Membership[20];
    Membership[] pool = new Membership[20];
    Membership[] aerobic = new Membership[20];

    int m = 0;
    int m1 = 0;
    int m2 = 0;
    int m3 = 0;

    public void addM(Membership member) {
        for (int i = 0; i < all.length; i++) {
            if (all[i] == null) {
                all[i] = member;
                m = m + 1;
                break;
            }
            if (m == all.length) {
                System.out.println("Мест нигде нет");
            }
        }
    }

    public void addG(Membership member) {
        for (int i = 0; i < gym.length; i++) {
            if (gym[i] == null) {
                gym[i] = member;
                //System.out.println("В тренажерном: " + member.name);
                m1 = m1 + 1;
                break;
            }
            if (m1 == gym.length) {
                System.out.println("Мест в тренажерном нет");
                break;
            }
        }
    }

    public void addP(Membership member) {
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] == null) {
                pool[i] = member;
                // System.out.println("В бассейне: " + member.name);
                m2 = m2 + 1;
                break;
            }
            if (m2 == pool.length) {
                System.out.println("Мест в бассейне нет");
                break;
            }
        }
    }

    public void addA(Membership member) {
        for (int i = 0; i < aerobic.length; i++) {
            if (aerobic[i] == null) {
                aerobic[i] = member;
                // System.out.println("В групповом: " + member.name);
                m3 = m3 + 1;
                break;
            }
            if (m3 == aerobic.length) {
                System.out.println("Мест в групповом нет");
                break;
            }
        }
    }

    int a;
    Random random1;

    public void Day() {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalTime open = LocalTime.of(8, 0);
        LocalTime close = LocalTime.of(22, 0);


        if (currentTime.equals(close)  || currentTime.isAfter(close) || currentTime.isBefore(open)) {
            System.out.println("Фитнес закрыт");
            for (int i = 0; i < all.length; i++) {
                all[i] = null;
            }
        } else if (currentTime.equals(open) || currentTime.isAfter(open)) {
            System.out.println("Фитнес открыт");
            //cначала запускаем всех
            for (int i = 0; i < all.length; i++) {
                // проверка на дату абонемента, если не подходит - выгоняем
                if (all[i] != null) {
                    if (currentDate.isAfter(all[i].end)) {
                        System.out.println("Срок абонемента закончился: " + all[i].name);
                        all[i] = null;
                    }
                }
                //теперь проверяем на время абонемента

                if (all[i] != null) {
                    if (all[i].stTime().isBefore(currentTime) == true
                            && all[i].eTime().isAfter(currentTime) == true) {

                    } else {
                        System.out.println("Абонемент не включает это время: " + all[i].name);
                        all[i] = null;
                    }

                }

            }

            // дальше работаем с оствшимися

            for (int i = 0; i < all.length; i++) {
                if (all[i] != null) {
                    random1 = new Random(new Date().getTime());
                    a = random1.nextInt(3) + 1;
                    if (a == 1) { // посетитель захочет в тренажку
                        if (all[i].ableGym() == true) {
                            addG(all[i]);
                        }
                    } else if (a == 2) {  // посетитель захочет в бассейн
                        if (all[i].ablePool() == true) {
                            addP(all[i]);
                        }
                    } else if (a == 3) { //  посетитель захочет в групповой
                        if (all[i].ableAerob() == true) {
                            addA(all[i]);
                        }
                    }
                }
            }
        }

    }

    int p1 = 0;
    int p2 = 0;
    int p3 = 0;

    public void Inf() {
        System.out.println("Тренажерный зал:");
        for (int i = 0; i < gym.length; i++) {
            if (gym[i] != null) {
                System.out.println("Фамилия: " + gym[i].surname + " имя: " + gym[i].name);
                p1 = p1 + 1;
            }
        }
        if (p1 == 0) {
            System.out.println("никого");
        }

        System.out.println("Бассейн:");
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] != null) {
                System.out.println("Фамилия: " + pool[i].surname + " имя: " + pool[i].name);
                p2 = p2 + 1;
            }
        }
        if (p2 == 0) {
            System.out.println("никого");
        }

        System.out.println("Групповые занятия:");
        for (int i = 0; i < aerobic.length; i++) {
            if (aerobic[i] != null) {
                System.out.println("Фамилия: " + aerobic[i].surname + " имя: " + aerobic[i].name);
                p3 = p3 + 1;
            }
        }
        if (p3 == 0) {
            System.out.println("никого");
        }
    }

    String active;
    int num = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("в H ч. и mm мин.");

    public void MemInf() {
        for (int j = 0; j < all.length; j++) {
            if (all[j] != null) {
                num = num + 1;
                System.out.println("Имя клиента: " + all[j].name + " его номер: " + j);
            }
        }
        System.out.println("Всего клиентов в зале: " + num);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер интересующего клиента:");
        int n = in.nextInt();


        for (int j = 0; j < gym.length; j++) {
            if (all[n] != null && gym[j] != null && all[n].surname.contains(gym[j].surname) == true) {
                active = "тренажерный зал";
            }
        }

        for (int j = 0; j < pool.length; j++) {
            if (all[n] != null && pool[j] != null && all[n].surname.contains(pool[j].surname) == true) {
                active = "бассейн";
            }
        }

        for (int j = 0; j < aerobic.length; j++) {
            if (all[n] != null && aerobic[j] != null && all[n].surname.contains(aerobic[j].surname) == true) {
                active = "групповой зал";
            }
        }
        if (active.contains("тренажерный зал") == false && active.contains("бассейн") == false && active.contains("групповой зал") == false) {
            active = "не попал в желаемую зону";
        }
        if (all[n] != null) {
            System.out.println(all[n].surname + " " + all[n].name + " " + active + " " + LocalTime.now().format(formatter) + " " + LocalDate.now());
        }

    }


}

