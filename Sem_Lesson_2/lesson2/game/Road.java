package Sem_Lesson_2.lesson2.game;

public class Road {

    private final int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanRun canRun) {
        return canRun.getRun() >= distance;
    }
}
