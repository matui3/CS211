package Chapter9b;

import java.awt.*;

public class Snake implements Animal {


    private boolean east;
    private boolean south;

    private int moveDistance;

    private int currentDistance;



    public Snake() {
        super();
        east = true;
        south = true;
    }

    public String toString() {
        return "S";
    }
    @Override
    public int getMove() {
        if (south) {
            moveDistance++;
            south = false;
            return SOUTH;
        }

        if (currentDistance > moveDistance) {
            east = !east;
            south = true;
            currentDistance = 0;
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


