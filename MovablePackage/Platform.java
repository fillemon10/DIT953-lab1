package MovablePackage;

/**
 * @author A13
 */
public class Platform {
    private int angle = 0;
    private boolean platformIsUp = false;

    public Platform() {
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

    public void changPlatformState(){
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
