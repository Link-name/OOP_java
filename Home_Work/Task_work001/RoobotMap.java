package Home_Work.Task_work001;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoobotMap {
    private int n;
    private int m;
    private final int MaxCountRobots;
    private final List<Robot> robots; 
    

    public RoobotMap(int n, int m, int MaxCountRobots){
        

        this.n = validateRobotMap(n);
        this.m =  validateRobotMap(m);
        this.MaxCountRobots = MaxCountRobots;
        
        this.robots = new ArrayList<>(MaxCountRobots);
    }
    public RoobotMap(int n, int m){
        this(n,m,5);
    }
    
    
    public Robot createRobot(Point point){
        // System.out.println("На карте созданно " + (robots.size() +1) + " Робота - находится на точке"+ point);
        try {
            validatePoint(point);
            if(robots.size()>=MaxCountRobots)
            throw new IllegalStateException ("Достигнуто максимальное количество роботов" + MaxCountRobots);
            Robot robot = new Robot(point);
                robots.add(robot);
                System.out.println("На карте созданно " + robots.size() + " Робота - находится на точке"+ point);    
            return robot;
        } catch (IllegalStateException e) {
        System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Создание робота на другой точке...");
        Point newPoint = Point.getRandomPoint();
        return createRobot(newPoint); // recursively call createRobot() with the new point
        
        }
        }
       
    
    // public Robot createRobot(Point point){

    //     return this(robots.add(robot));
    // } 


    private void validatePoint(Point point){

        validaterPointCorrect(point);
        validatePointIsFree(point);
    }

    private static int validateRobotMap(int n) {
        if(n < 0){
            throw new IllegalStateException(" Параменты карты не могут быть отрицательными  =" + n );
        } 
        return n;
    }    

    
    private void validatePointIsFree(Point point){
        
        for (Robot robot : robots) {
            
            
            // Point robotPoint = robot.point;
            // if(robotPoint.getX()==point.getX() && robotPoint.getY() == point.getY());  замена переопределения equals
            // if(robotPoint.equals(point))
            if (robot.point.equals(point)) {
                throw new IllegalStateException("Точка " + point + "занята");
                
            }
            
        }
        
    }
    
    private void validaterPointCorrect(Point point){
        if(point.getX() < 0 || point.getX() > n || point.getY() < 0 || point.getY()> m){
            throw new IllegalStateException("Не коректное значение точки, робот вышел за границе поля");

         }
    }     
    public class Robot{
        

        private static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private Direction direction;
        private Point point;
        // private int countRobots;

        public Robot(Point point) {
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        
        }
        
        // public void RobotCount (int countRobots){
        //     this.countRobots = countRobots;
        // }

        
        public void changeDiretrion(Direction direction){
            this.direction = direction;
        }

        public void move(){  
            Point newPoint = switch (direction){
                case TOP -> newPoint = new Point(point.getX()-1, point.getY());
                case RIGHT -> newPoint = new Point(point.getX(), point.getY()+1);
                case BOTTOM -> newPoint = new Point(point.getX()+1, point.getY());
                case LEFT -> newPoint = new Point(point.getX(), point.getY()-1);
            };
            validatePoint(newPoint);
            
            System.out.println("Робот переместился с " + point + " на " + newPoint);
            this.point = newPoint;
            
            
        }
        @Override
        public String toString() {
            return point.toString() +", ["+ direction.name()+"]"; // direction.name() = стора в которую смотрит робат
        }
    }
   
}
    

