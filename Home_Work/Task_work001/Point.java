package Home_Work.Task_work001;

import java.util.Objects;
import java.util.Random;

public class Point {
    private final int x ;
    private final int y ;  
    private static final Random random = new Random();

    public static Point getRandomPoint(){
        int x = random.nextInt(0, 10);
        int y = random.nextInt(0, 10);
        return new Point(x, y);
    } 

    public Point(int x , int y ){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    @Override
    public String toString() {
       
        return "[" + x + ","+ y + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
        
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
    // if o1.equals(o2) => o1.HashCode() == o2.hashCode()
    // if o1.hashcode() != o2.hashCode() => !o1.equals(o2)
}
