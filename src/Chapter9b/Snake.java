package Chapter9b;

import java.awt.*;

public class Snake implements Animal {


    private boolean east;
    private boolean south;

    private int moveDistance;

    private int currentDistance;



    public Snake() {
        super();
        east = false;
        south = true;
    }

    public String toString() {
        return "S";
    }
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

    @Override
    public Color getColor() {
        return new Color(100, 100, 0);
    }
}


