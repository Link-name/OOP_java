package Home_Work.Task_work002.game;

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
