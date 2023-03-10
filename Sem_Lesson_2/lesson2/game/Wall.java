package Sem_Lesson_2.lesson2.game;

public class Wall {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(CanJump canJump) {
        return canJump.getJump() >= height;
    }

}
