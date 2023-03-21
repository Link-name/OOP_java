package Home_Work.task_6;

import java.util.Optional;

public enum Direction {

    TOP, RIGHT, BOTTOM, LEFT;

    public static Optional<Direction> ofString(String str) {
            Direction[] values = values();
            for (Direction value : values) {
                if (str.equals(value.name())) {
                    return Optional.of(value);
                }
            }
            return Optional.empty();
        }
        // switch (str) {
        //     case "TOP":
        //         return Optional.of(TOP);
        //     case "RIGHT":
        //         return Optional.of(RIGHT);
        //     case "BOTTOM":
        //         return Optional.of(BOTTOM);
        //     case "LEFT":
        //         return Optional.of(LEFT);
        //     default:
        //         return Optional.empty();
        // }
    }


