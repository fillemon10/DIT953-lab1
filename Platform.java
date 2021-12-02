/**
 * @author A13
 */
public class Platform {
    private int angle;
    private boolean platformIsUp;

    /**
     * @param angle
     * @param platformIsUp
     */
    public Platform(int angle, boolean platformIsUp){
        angle = Math.min(70,angle);
        angle = Math.max(angle, 0);
        this.angle = angle;
        this.platformIsUp = platformIsUp;
    }

    /**
     * @param inAngle
     */
    public void changeAngle(int inAngle){
        angle = Math.min(Math.max(angle + inAngle, 0), 70);
        if (angle == 0){
            platformIsUp = false;
        }
        else {
            platformIsUp = true;
        }
    }

    public void changPlatformstate(){
        platformIsUp = !platformIsUp;
    }

    /**
     * @return isRaised
     */
    public boolean isRaised() {
        return platformIsUp;
    }

    /**
     * @return angle
     */
    public int getAngle(){
        return angle;
    }
}
