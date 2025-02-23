package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(LIMIT), randomColor.getRandomColor());
    }
}
