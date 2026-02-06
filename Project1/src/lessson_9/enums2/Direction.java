package lessson_9.enums2;

import java.util.Random;

public enum Direction {
    TOP, RIGHT, BOTTOM, LEFT;
    private static final Random RANDOM = new Random();
    public static Direction randomDirection() {
        Direction[] directions = values();
        return directions[RANDOM.nextInt(directions.length)];
    }
}
