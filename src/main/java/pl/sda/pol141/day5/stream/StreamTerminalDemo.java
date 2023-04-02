package pl.sda.pol141.day5.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalDemo {
    public static void main(String[] args) {
        final String joining = StreamCreationDemo.namesStream()
                .limit(100)
                .collect(Collectors.joining("; "));
        System.out.println(joining);
        final Set<String> set = StreamCreationDemo.namesStream()
                .limit(100)
                .collect(Collectors.toSet());
        System.out.println(set);
        final List<String> list = StreamCreationDemo.namesStream()
                .limit(100)
                .collect(Collectors.toList());
        System.out.println("***********AnyMatch***********");
        final boolean anyMatch = StreamCreationDemo.namesStream()
                .limit(100)
                .anyMatch(name -> name
                        .startsWith("H"));
        System.out.println("Czy jest jakieś imię na H: " + anyMatch);
        System.out.println("***********AllMatch***********");
        final boolean allMatch = StreamCreationDemo.namesStream()
                .limit(100)
                .allMatch(name -> name
                        .contains("a"));
        System.out.println("Czy jest wszystkie imiona zawierają a: " + allMatch);
        System.out.println("***********Find***********");
        var find = StreamCreationDemo.namesStream()
                .limit(100)
                .findAny();
        System.out.println("Jakikolwiek element: " + find);
        System.out.println("***********FindFirst***********");
        var findFirst = StreamCreationDemo.namesStream()
                .limit(100)
                .findFirst();
        System.out.println("Jakikolwiek element: " + findFirst);
        System.out.println("***********Reduce***********");
        String reduce = StreamCreationDemo.namesStream()
                .limit(100)
                .reduce("", (acc, name) -> acc + "; " + name);
        System.out.println("Wynik reduce: " + reduce);
        int[] arr = {1, 2, 3};
        int acc = 0;
        for (int i =0; i < arr.length; i++){
            acc += arr[i];
        }
    }


}
