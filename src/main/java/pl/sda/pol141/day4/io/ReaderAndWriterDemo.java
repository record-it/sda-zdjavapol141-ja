package pl.sda.pol141.day4.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream("c:\\data\\output.txt"));
        int item = reader.read();
        while(item != -1){
            System.out.print((char) item);
            item = reader.read();
        }
        reader.close();
        System.out.println();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("c:\\data\\output.txt")
                )
        );
        String line  = null;
        List<String> lines = new ArrayList<>();
        while((line = bufferedReader.readLine()) != null){
            lines.add(line);
            System.out.println(line);
        }
        bufferedReader.close();

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\data\\result.txt")
                )
        );
        writer.write("ABCD" + System.lineSeparator());
        writer.write("ERTY");
        writer.close();
    }
}
