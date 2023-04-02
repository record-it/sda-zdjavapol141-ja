package pl.sda.pol141.day5.stream;

import java.util.stream.Stream;

public class StreamProcessingDemo {
    public static void main(String[] args) {
        StreamCreationDemo.namesStream()
                .limit(10)
                .filter(name -> {
                    System.out.println("predicate for " + name);
                    return name.toUpperCase().startsWith("A");
                }) // operacja pośrednia
                .forEach(System.out::println);                      // operacja terminalna

        final Stream<String> afterfiltering = StreamCreationDemo.namesStream()
                .limit(100)
                .filter(name -> {
                    System.out.println("predicate for " + name);
                    return name.toUpperCase().startsWith("A");      //strumień zapamiętuje tylko operacje do wykonania
                });
        afterfiltering.forEach(System.out::println);                //operacja terminalna wymusza wykonania operacji na strumieniu
    }
}
