package pl.sda.pol141.day5.functional;

import java.util.function.Supplier;

public class Box<T> {
    Supplier<T[]> content;

    public Box(Supplier<T[]> source) {
        this.content = source;
    }

    public T[] getContent() {
        return content.get();
    }
}
