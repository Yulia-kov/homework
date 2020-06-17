package kursach;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message  implements Serializable {
    private String sender;
    private Object text;
    private LocalDateTime dateTime;

    public Message (String sender, Object text) {
        this.sender = sender;
        this.text = text;
    }

    public Message() {
    }

    public void setDateTime() {
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Message: " +
                "sender ='" + sender + '\'' +
                ", text ='" + text + '\'' +
                ", dateTime =" + dateTime +
                '}';
    }
    public static Message getInstance(String sender, Object text){
        return new Message(sender, text);
    }
}