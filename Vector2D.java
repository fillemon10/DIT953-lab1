import static java.lang.Math.PI;

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
