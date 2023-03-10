package Home_Work.Task_work002.game;

public class Wall {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(CanJump canJump) {
        return canJump.getJump() >= height;
    }

}
