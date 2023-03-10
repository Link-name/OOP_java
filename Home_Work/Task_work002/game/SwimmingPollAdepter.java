package Home_Work.Task_work002.game;

public class SwimmingPollAdepter implements Obstacle{
    private final SwimmingPoll swimmingPoll;

    public SwimmingPollAdepter(SwimmingPoll swimmingPoll){
        this.swimmingPoll = swimmingPoll;

    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }


    
}
