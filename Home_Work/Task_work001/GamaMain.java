package Home_Work.Task_work001;

public class GamaMain {
    public static void main(String[] args) {
        //Карта с робатами.
        // Карта имеет n x m , где n и m - положительные целые числа 
        // должна быть возможность создать робота на какой-то точке на крате.
        // Точка на карте описывается двумя целочесленными координатами.
        // Роботы могут перемещаться по карте вперед
        // В одно точке не может быть находиться несколько роботов.
    
        RoobotMap map = new RoobotMap(15, 15,7);
        
        
        RoobotMap.Robot robot = map.createRobot(new Point(5, 5));
        RoobotMap.Robot robot2 = map.createRobot(new Point(5, 5));

        

        
        System.out.println("Точка появления работа = " + robot); 
        robot.move(1); //1,3
        System.out.println("Шаг робота = " + robot);     
        robot.changeDiretrion(Direction.BOTTOM); 
        robot.move(3);
        // robot.move();
        // robot.move();
        // robot.move();
        // robot.move();
        // robot.move();
        robot.changeDiretrion(Direction.LEFT);
        // robot.move();
        System.out.println("Точка нахождения робота = "+ robot);
}

}