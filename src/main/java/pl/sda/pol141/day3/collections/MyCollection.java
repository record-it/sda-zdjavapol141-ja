package pl.sda.pol141.day3.collections;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<E> {
    private static final String DELIMITER_REGEXP = "\\|";
    private static final String DELIMITER = "|";
    private String content;
    //"1|2|5|7";
    //"abc|cde|asd"
    @Override
    public int size() {
        return content.split(DELIMITER_REGEXP).length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        final String[] strings = content.split(DELIMITER_REGEXP);
        for(var item: strings){
            if (item.equals(o.toString())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return content.split(DELIMITER_REGEXP);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        content = content + DELIMITER + e.toString();
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            final String[] strings = content.split(DELIMITER_REGEXP);
            String removed = o.toString();
            String newContent = "";
            for (var item : strings) {
                if (!item.equals(o.toString())) {
                    newContent += item + DELIMITER;
                }
            }
            //1|2|3|5|7
            //removed 3
            // 1 2 3 5 7
            // 1|2|5|7|
            content = newContent.substring(0, newContent.length() - 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        content = "";
    }
}
