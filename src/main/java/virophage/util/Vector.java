package virophage.util;

import java.awt.*;

/**
 * Class for representing vector operations.
 */
public class Vector {

    /**
     * The x unit vector.
     */
    public static final Vector i = new Vector(1, 0);

    /**
     * The y unit vector.
     */
    public static final Vector j = new Vector(0, 1);

    public final double x;
    public final double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Vector that) {
        return x == that.x && y == that.y;
    }

    public Vector negate() {
        return new Vector(-x, -y);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector normalize() {
        return new Vector(x / magnitude(), y / magnitude());
    }

    public Vector add(Vector that) {
        return new Vector(x + that.x, y + that.y);
    }

    public Vector subtract(Vector that) {
        return this.add(that.negate());
    }

    public Vector scale(double scalar) {
        return new Vector(x * scalar, y * scalar);
    }

    public Point toPoint() {
        return new Point((int) x, (int) y);
    }

    public Dimension toDimension() {
        return new Dimension((int) x, (int) y);
    }

}