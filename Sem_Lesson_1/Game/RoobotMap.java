package Sem_Lesson_1.Game;



public class RoobotMap {
    private int n;
    private int m;

    public RoobotMap(int n, int m){
        this.n = n;
        this.m = m;
    }

    public Robot createRobot(Point point){
        return new Robot(point);
    }

    public class Robot{
        

        private Direction direction;
        private Point point;

        public Robot(Point point){
            this.direction = Direction.TOP;
            this.point = point;
        }
        
        public void move(){  
            final Point newPoint;
            this.point = switch (direction){
                case TOP -> newPoint = new Point(point.getX()-1, point.getY());
                case RIGHT -> newPoint = new Point(point.getX(), point.getY()+1);
                case BOTTOM -> newPoint = new Point(point.getX()+1, point.getY());
                case LEFT -> newPoint = new Point(point.getX(), point.getY()-1);
            };
            
        }
        @Override
        public String toString() {
            return point.toString() +", ["+ direction.name()+"]";
        }
    }
}
    

