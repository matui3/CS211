package Homework.Chapter9b;

import java.awt.*;
import java.util.Random;

// Jon Formantes
// CS 211
// Winter 2023 - 1/9/2023
// Frog class, contains a field for choice (determine direction), step for # of num of moves, and rand for new choice.
public class Frog implements Animal {

    // initializes fields
    private int choice;
    private int step;
    private Random rand;

    // Basic frog constructor
    public Frog() {
        super();
        rand = new Random();
    }
    // Get move, moves 3 steps in a random direction before switching
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

    // shows color of frog
    @Override
    public Color getColor() {
        return new Color(0, 255, 0);
    }

    // shows the string representation of frog
    public String toString() {
        return "F";
    }
}
