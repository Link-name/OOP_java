package Sem_Lesson_1.Game;


import java.util.ArrayList;
import java.util.List;

public class RoobotMap {
    private int n;
    private int m;

    private final List<Robot> robots; 

    public RoobotMap(int n, int m){
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
    }

    public Robot createRobot(Point point){
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        
        return robot;
    }


    private void validatePoint(Point point){

        validaterPointCorrect(point);
        validatePointIsFree(point);

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
        if(point.getX() < 0 || point.getX() > n || point.getY() < 0 || point.getY()>m){
            throw new IllegalStateException("Не коректное значение точки");

         }
    }     
    public class Robot{
        

        private static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private Direction direction;
        private Point point;

        public Robot(Point point){
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }
        
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
    

