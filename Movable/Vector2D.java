package Movable;

import static java.lang.Math.PI;

/**
 * @author A13
 */
public class Vector2D {
    private double x;
    private double y;
    private double angle;
    public Vector2D(){
        this.x = 0;
        this.y = 1;
        this.angle = PI/2;
    }

    /**
     * @param x
     * @param y
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param newAngle
     */
    public void updateDirection(double newAngle){
        angle = newAngle;
        y = Math.sin(newAngle);
        x = Math.cos(newAngle);
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getDistance(Vector2D position){
        double dis = Math.sqrt(Math.pow(Math.abs(this.x - position.getX()),2) +
                Math.pow(Math.abs(this.y - position.getY()),2));
        return dis;
    }

    /**
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return angle
     */
    public double getAngle() {
        return angle;
    }
}
