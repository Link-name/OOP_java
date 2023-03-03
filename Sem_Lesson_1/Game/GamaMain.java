package Sem_Lesson_1.Game;

public class GamaMain {
    public static void main(String[] args) {
        //Карта с робатами.
        // Карта имеет n x m , где n и m - положительные целые числа 
        // должна быть возможность создать рлбота на какой-ещ точке на крате.
        // Точка на карте описывается двумя целочесленными координатами.
        // Роботы могут перемещаться по карте вперед
        // В одно точке не может быть находиться несколько роботов.
    
        RoobotMap map = new RoobotMap(5, 5);
        RoobotMap.Robot robot = map.createRobot(new Point(1, 2));
        System.out.println(robot); 
        robot.move(); //1,3
        System.out.println(robot);      
}

}