package pl.sda.pol141.day2.exceptions;

public class Email {
    private String to;
    private String from;
    private String content;
    private String subject;

    private Email(String to, String from, String content, String subject) {
        this.to = to;
        this.from = from;
        this.content = content;
        this.subject = subject;
    }

    public static Email of(String to, String from, String content, String subject){
        if (to == null){
           throw new NoFieldToInEmailException("No field `to` in email!");
        }
        if (from == null){
            throw new IllegalArgumentException("Field from cannot be null in email!");
        }
        return new Email(to, from, content, subject);
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", content='" + content + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
