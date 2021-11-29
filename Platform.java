public class Platform {
    private int angle;
    private boolean platformIsUp;

    public Platform(int angle, boolean platformIsUp){
        angle = Math.min(70,angle);
        angle = Math.max(angle, 0);
        this.angle = angle;
        this.platformIsUp = platformIsUp;
    }

    public int getAngle(){
        return angle;
    }
}
