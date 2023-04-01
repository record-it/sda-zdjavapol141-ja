package pl.sda.pol141.day4.annotations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private int editionYear;
    private String publisher;
}
