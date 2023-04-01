package pl.sda.pol141.day4.io;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream stream = new PrintStream(System.out);
        stream.write("Hello World!".getBytes());
        stream = new FileOutputStream("c:\\data\\console.txt");
        stream.write("Hello World!".getBytes());
        byte[] buffer = new byte[1024];
        stream = new ByteArrayOutputStream();
        stream.write("Hello World!".getBytes());

        InputStream inputStream = new FileInputStream("c:\\data\\console.txt");
        final int read = inputStream.read();
        System.out.println(read);
    }
}
