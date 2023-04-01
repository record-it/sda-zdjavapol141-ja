package pl.sda.pol141.day4.annotations;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Java", "Bloch", 2000, "Helion");
        book.setTitle("Java");
        book.setAuthor("Bloch");
        book.setEditionYear(2020);
        System.out.println(book);
        final Book book1 = Book.builder()
                .author("Freeman")
                .title("Asp.NET")
                .editionYear(2021)
                .publisher("PWN")
                .build();
    }
}
