package MovablePackage;

/**
 * @author A13
 */
public class Platform {
    private int angle = 0;
    private boolean platformIsUp = false;
    private IPlatformLogic platformLogic;

    public Platform(IPlatformLogic platformLogic) {
        this.platformLogic = platformLogic;
    }

    /**
     * @param inAngle
     */
    public void raisePlatform(){
        platformIsUp = platformLogic.raisePlatform(angle,platformIsUp);
    }
    public void lowerPlatform(){
        platformIsUp = platformLogic.lowerPlatform(angle,platformIsUp);
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
