public class Position2D {
    private double xPos;
    private double yPos;
    public Position2D(double x, double y){
        this.xPos = x;
        this.yPos = y;
    }
    public double getxPos(){
        return xPos;
    }
    public double getyPos(){
        return yPos;
    }
    public void setxPos(double newxPos){
        xPos = newxPos;
    }
    public void setyPos(double newyPos){
        xPos = newyPos;
    }
}
