package BJPExercises.Chapter9;

public class Octagon implements Shape {

    public static final int SIDELENGTH = 5;

    @Override
    public double getArea() {
        return 2 * Math.pow(SIDELENGTH, 2) * (1 + Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return 8 * SIDELENGTH;
    }
}
