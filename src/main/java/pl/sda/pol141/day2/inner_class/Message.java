package pl.sda.pol141.day2.inner_class;

import java.time.LocalDateTime;
import java.util.Locale;

public class Message {
    private String content;
    private LocalDateTime createdAt;
    private String subject;

    private Message(String content, LocalDateTime createdAt, String subject) {
        this.content = content;
        this.createdAt = createdAt;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public static class Builder{
        private String content;
        private LocalDateTime createdAt;
        private String subject;

        public Builder() {
        }
        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder createAt(LocalDateTime createdAt){
            this.createdAt = createdAt;
            return this;
        }

        //Zadeklaruj i zaimplementuj metodę subject

        public Message build(){
            return new Message(content, createdAt, subject);
        }

    }
}
