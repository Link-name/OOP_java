package Home_Work.Task_work002.game;

public class SwimmingPoll{

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    
    public boolean pass(CanSwim canSwim) {
        return canSwim.getSwim() >= distance;
    }


}
