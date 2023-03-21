package Test;

public class 1111 {
    To make the code more modular and reusable, we can introduce interfaces for the RobotMap and Robot classes.

First, let's create the IRobotMap interface:

java
Copy code
package Home_Work.task_5;

import java.util.Optional;
import java.util.function.Consumer;

public interface IRobotMap {

    Robot createRobot(Point point);

    void acceptRobots(Consumer<Robot> robotAcceptor);

    Optional<Robot> getById(Long id);

    boolean delete(long robotId);
}
Next, we can modify the RobotMap class to implement the IRobotMap interface:

java
Copy code
package Home_Work.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RobotMap implements IRobotMap {

    private final int n;
    private final int m;
    private final List<Robot> robots;

    public RobotMap(int n, int m) {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
    }

    @Override
    public Robot createRobot(Point point) {
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);

        return robot;
    }

    @Override
    public void acceptRobots(Consumer<Robot> robotAcceptor) {
        for (Robot robot : robots) {
            robotAcceptor.accept(robot);
        }
    }
    

    @Override
    public Optional<Robot> getById(Long id) {
        for (Robot robot : robots) {
            if (id.equals(robot.id)) {
                return Optional.of(robot);
            }
        }

        return Optional.empty();
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некоректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            Point robotPoint = robot.point;
            if (robotPoint.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }
    }

    @Override
    public boolean delete(long robotId) {
        Optional<Robot> robot = getById(robotId);
        if (robot.isPresent()) {
            robots.remove(robot.get());
            return true;
        } else {
            return false;
        }
    }

    public class Robot {

        public static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private static final Long idCounter = 1L;

        private final Long id;
        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.id = idCounter + robots.size();
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }

    
}
