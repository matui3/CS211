package Chapter9b;

import java.awt.*;
import java.util.Random;

public class Frog implements Animal {
    private int choice;
    private int step;
    private Random rand;

    public Frog() {
        super();
        rand = new Random();
    }


    @Override
    public int getMove() {
        if (step == 12) {
            step = 0;
        }
        if (step % 3 == 0) {
            choice = rand.nextInt(4);
        }
        if (choice == 0) {
            step++;
            return NORTH;
        } else if (choice == 1) {
            step++;
            return SOUTH;
        } else if (choice == 2) {
            step++;
            return WEST;
        } else {
            step++;
            return EAST;
        }
    }

    @Override
    public Color getColor() {
        return new Color(0, 255, 0);
    }

    public String toString() {
        return "F";
    }
}
