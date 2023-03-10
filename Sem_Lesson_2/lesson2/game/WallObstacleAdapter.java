package Sem_Lesson_2.lesson2.game;

public class WallObstacleAdapter implements Obstacle {

    private final Wall wall;

    public WallObstacleAdapter(Wall wall) {
        this.wall = wall;
    }

    @Override
    public boolean pass(Participant participant) {
        return wall.pass(participant);
    }
}
