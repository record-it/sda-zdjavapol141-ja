package pl.sda.pol141.day4.io;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FilesNIODemo {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("c:\\data\\data.txt");
        CopyOption[] options = {StandardCopyOption.REPLACE_EXISTING};
        Path copy = Paths.get("c:\\data\\copy.txt");
        Files.copy(pathToFile, copy, options);
        final List<String> lines = Files.readAllLines(pathToFile);
        final String content = Files.readString(pathToFile);
        System.out.println(content);
        lines.add("666");
        lines.remove(0);
        Files.write(pathToFile, lines);
    }
}
