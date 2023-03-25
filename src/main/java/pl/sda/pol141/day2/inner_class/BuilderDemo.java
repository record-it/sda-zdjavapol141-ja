package pl.sda.pol141.day2.inner_class;

import java.time.LocalDateTime;

public class BuilderDemo {
    public static void main(String[] args) {
        Message.Builder builder = new Message.Builder();
        final Message message = builder
                .content("Hello")
                .subject("Welcome")
                .createAt(LocalDateTime.now())
                .build();
        System.out.println(message);
    }
}
