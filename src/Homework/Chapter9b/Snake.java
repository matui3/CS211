package Homework.Chapter9b;// Jon Formantes
// CS 211
// Winter 2023 - 1/9/2023
// Snake class, contains multiple fields for toggling direction and two ints to determine the current step as each distance increases

import java.awt.*;

public class Snake implements Animal {
    // initialize fields for snake, boolean to toggle E/W, toggle for south, two ints to track the distance needed to be moved and current step
    private boolean east;
    private boolean south;

    private int moveDistance;

    private int currentDistance;

    // bnasic snake constructor
    public Snake() {
        super();
        east = false;
        south = true;
    }
    // string representation of snake
    public String toString() {
        return "S";
    }

    // get move, toggles between E/W and takes one step south. Snake moves increasing distance between E/W
    @Override
    public int getMove() {
        if (currentDistance == moveDistance) {
            east = !east;
            south = true;
            currentDistance = 0;
        }
        if (south) {
            moveDistance++;
            south = false;
            return SOUTH;
        }
        currentDistance++;
        if (east) {
            return EAST;
        } else {
            return WEST;
        }
    }

    // provides color of snake
    @Override
    public Color getColor() {
        return new Color(100, 100, 0);
    }
}


