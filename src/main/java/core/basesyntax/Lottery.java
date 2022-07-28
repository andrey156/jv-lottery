package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int HUNDRED = 100;
    private Random rnd = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = rnd.nextInt(HUNDRED);
        return new Ball(color, number);
    }
}
