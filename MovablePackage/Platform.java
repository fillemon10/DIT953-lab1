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
        platformIsUp = platformLogic.raisePlatform(platformIsUp,this);
    }
    public void lowerPlatform(){
        platformIsUp = platformLogic.lowerPlatform(platformIsUp,this);
    }

    /**
     * @return isRaised
     */
    public boolean isRaised() {
        return platformIsUp;
    }
    public int getAngle(){return angle;}
    public void setAngle(int inAngle){angle = inAngle;}
}
