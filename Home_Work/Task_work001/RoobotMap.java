package Home_Work.Task_work001;


import java.util.ArrayList;
import java.util.List;


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
        try {
            validatePoint(point);
            if(robots.size()>=MaxCountRobots)
            throw new IllegalStateException ("Достигнуто максимальное количество роботов" + MaxCountRobots);
            Robot robot = new Robot(point);
                robots.add(robot);
                System.out.println("На карте создан " + robots.size() + " Робот - находится на точке"+ point);    
            return robot;
        } catch (IllegalStateException e) {
        System.out.println("Ошибка: " + e.getMessage());
        Point newPoint = Point.getRandomPoint(n);
        if(robots.size()< MaxCountRobots){
            System.out.println("Создание робота на другой точке...");
            return createRobot(newPoint); 
        }
        return null;
        }
        }
       
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

        public void move(int number_steps){  
            Point newPoint = switch (direction){
                case TOP -> newPoint = new Point(point.getX()-number_steps, point.getY());
                case RIGHT -> newPoint = new Point(point.getX(), point.getY()+number_steps);
                case BOTTOM -> newPoint = new Point(point.getX()+number_steps, point.getY());
                case LEFT -> newPoint = new Point(point.getX(), point.getY()-number_steps);
            };
            validatePoint(newPoint);
            
            System.out.println("Робот переместился с " + point + " на " + newPoint);
            System.out.println("Робот сделал "+ number_steps + " шага");
            this.point = newPoint;
            
            
        }

        

        @Override
        public String toString() {
            return point.toString() +", ["+ direction.name()+"]"; // direction.name() = стора в которую смотрит робат
        }
    }
   
}
    

