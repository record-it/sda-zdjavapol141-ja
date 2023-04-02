package pl.sda.pol141.day5.functional;

@FunctionalInterface
interface StringOperation{
    String apply(String s);
}

@FunctionalInterface
interface NumbersOperation{
    double apply(double a, double b);
}
// a + b
// b - b
// a * b
// a / b
// a * a + b
@FunctionalInterface
interface AbstractNumberOperation<R extends Number, T extends Number, V extends Number>{
    R apply(T a, V b);
}

interface MyFunction<T, R>{
    R apply(T value);
}

public class FunctionalExercises {
    public static void main(String[] args) {
        MyFunction<String, String> trim2 = s -> s.trim();
        //zapisz lambdę, która zwraca łańcuch wejściowy bez zbędnych spacji na końcu
        StringOperation trim = s -> s.trim();
        //zapisz lambdę, która połączy łańuch wejściowy z "abc"
        StringOperation join = s -> s + "abcd";
        System.out.println(process(" sda asd", join));
        /**********************************************/
        NumbersOperation add = (liczba1, liczba2) -> liczba1 + liczba2;
        // funkcja która podwaja a i dodaje połowę b
        NumbersOperation fun = (a, b) -> a * 2 + b / 2;
        System.out.println(fun.apply(6, 8));
        /*********************************************/
        AbstractNumberOperation<Long, Long, Long> addLong = (a, b) -> a + b;
        AbstractNumberOperation<Double, Integer, Double> customAdd = (a ,b) -> a + b;
        System.out.println(customAdd.apply(1, 2.5));
        // Zdefiniuj mnożenie liczby typu Byte przez Integer a wynik jako Long
        AbstractNumberOperation<Long, Byte, Integer> mul = (a, b) -> (long) (a * b);
        System.out.println(mul.apply((byte) 30, 23));
    }


    //Funkcja wyższego rzędu, argumentem jest inna funkcja
    public static String process(String s, StringOperation operation){
        return operation.apply(s);
    }

}

