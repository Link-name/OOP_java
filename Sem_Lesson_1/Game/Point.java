package Sem_Lesson_1.Game;

public class Point {
    private final int x ;
    private final int y ;  

    public Point(int x , int y ){
        this.x = y;
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
}
