package pl.sda.pol141.day5.stream;

public class StreamOtherMethodsDemo {
    public static void main(String[] args) {
        System.out.println("*******************Przykład dla distinct ******************");
        StreamCreationDemo.namesStream()
                .skip(5)
                .limit(100)
                .distinct()             // bez powtórzeń
                .forEach(System.out::println);
        System.out.println("*******************Przykład dla sort i peek******************");
        StreamCreationDemo.namesStream()
                .limit(10)
                .peek(name -> System.out.println("Peej " + name))  // wykonanie jakiegoś działania na elemencie
                .sorted()                                          // sortuje
                .forEach(System.out::println);
    }
}
