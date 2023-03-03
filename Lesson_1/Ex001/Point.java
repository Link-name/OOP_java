package Lesson_1.Ex001;

/**
 * Это точка 
 */

public class Point {
    private int x,y;
/**
 * Это конструктор ...
 * @param valueX это координата Х
 * @param valueY это координата Y
 */
    public Point(int valueX, int valueY) {
        x = valueX;
        y = valueY;
        
    }


    public Point(int value){ // работает через с такой же конструктор и через выбора ввода переменной ( количество)
        this(value, value);
    }
    public Point() {
        this(10);
    }
    
    public int getX() { // вывод приватных полей класса
        return x;
    }
    public int getY() {// вывод приватных полей класса (private)
        return y;
    }

    public void setX(int value){ // переопределения приватного поля в классе
        this.x = value;


    }
    // Первый вариант. Когда Конструктор под каждую задачю отдельный 
    // public Point() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point(int value) {
    //     x = value;
    //     y = value;
        
    // }
    
   public String getInfo(){
    return String.format("x : %d; y : %d", x , y);
   }

   @Override
   public String toString() {
       
       return getInfo();
   }
   static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+ Math.pow(a.y - b.y , 2));
   }
}
