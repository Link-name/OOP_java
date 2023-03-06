package Home_Work.Task_work001;

public class GamaMain {
    public static void main(String[] args) {
        //Карта с робатами.
        // Карта имеет n x m , где n и m - положительные целые числа 
        // должна быть возможность создать робота на какой-то точке на крате.
        // Точка на карте описывается двумя целочесленными координатами.
        // Роботы могут перемещаться по карте вперед
        // В одно точке не может быть находиться несколько роботов.
    
        RoobotMap map = new RoobotMap(10, 10,7);
        
        
        RoobotMap.Robot robot = map.createRobot(new Point(0, 0));
        RoobotMap.Robot robot2 = map.createRobot(new Point(5, 2));
        RoobotMap.Robot robot3 = map.createRobot(new Point(6, 2));
        RoobotMap.Robot robot4 = map.createRobot(new Point(6, 2));
        RoobotMap.Robot robot5 = map.createRobot(new Point(7, 3));
        RoobotMap.Robot robot6 = map.createRobot(new Point(7, 3));
        RoobotMap.Robot robot7 = map.createRobot(new Point(7, 3));
        RoobotMap.Robot robot8 = map.createRobot(new Point(7, 3));
        

        
        System.out.println("Точка появления работа = " + robot); 
        robot.move(); //1,3
        System.out.println("Шаг робота = " + robot);     
        robot.changeDiretrion(Direction.BOTTOM); 
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.changeDiretrion(Direction.LEFT);
        robot.move();
        System.out.println("Точка нахождения робота = "+ robot);
}

}