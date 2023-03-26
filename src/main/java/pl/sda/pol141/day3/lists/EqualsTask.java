package pl.sda.pol141.day3.lists;

import java.util.*;

public class EqualsTask {
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point point)) return false;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i< 100; i++){
            points.add(new Point(random.nextInt(5), random.nextInt(5)));
        }
        System.out.println(points.contains(new Point(2, 3)));
        int counter = 0;
        var p = new Point(2, 3);
        for (var point : points){
            counter += point.equals(p) ? 1 : 0;
        }
        System.out.println(counter);
    }
}
