package pl.sda.pol141.day4.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("c://data//output.txt");
        file.createNewFile();
        file.setWritable(true);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("Tekst w pliku".getBytes(), 0, 5);
        fileOutputStream.close();
        //dopisz na końcu pliku tekst `end`
        fileOutputStream=new FileOutputStream(file,true);
        fileOutputStream.write("the end".getBytes());
        fileOutputStream.close();
    }
}
