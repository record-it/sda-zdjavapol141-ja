package pl.sda.pol141.day2.inner_class;

public class Demo {
    private String message;
    class Point{
        private double x;
        private double y;

        public Point() {
            message = "12";
        }
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        Point point = demo.new Point();
        point.x = 10;
        System.out.println(demo.message);
    }
}
