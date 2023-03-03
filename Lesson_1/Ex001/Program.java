package Lesson_1.Ex001;

public class Program {


    public static void main(String[] args) {
        Point s = new Point(5,10);
        // s.setX(10);
        System.out.println(s.getX()); // используем getX() для вывода приватного поля класса, 
        // переопределить не можем только если пересоздать переменную этого класса( но она будет другая и занимать другой обьем памяти)
        System.out.println(s.getInfo());
        
        Point a = new Point(0);
        System.out.println(a.toString());
        // System.out.println(distance(s, a));
        var dis = Point.distance(s, a);
        System.out.println(dis);

    }
}
