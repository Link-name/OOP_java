package Home_Work.Task_work002.game;

public class RoadObstacleAdapter implements Obstacle {

    private final Road road;

    public RoadObstacleAdapter(Road road) {
        this.road = road;
    }

    @Override
    public boolean pass(Participant participant) {
        return road.pass(participant);
    }
}
