package Home_Work.task_5;

import java.util.Optional;

public enum Direction {

    TOP, RIGHT, BOTTOM, LEFT;

    public static Optional<Direction> ofString(String str) {
        switch (str) {
            case "TOP":
                return Optional.of(TOP);
            case "RIGHT":
                return Optional.of(RIGHT);
            case "BOTTOM":
                return Optional.of(BOTTOM);
            case "LEFT":
                return Optional.of(LEFT);
            default:
                return Optional.empty();
        }
    }


}
