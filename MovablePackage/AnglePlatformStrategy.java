package MovablePackage;

public class AnglePlatformStrategy implements IPlatformLogic {
    @Override
    public boolean raisePlatform(boolean platformIsUp,Platform platform) {
        platform.setAngle(Math.min(platform.getAngle() + 1, 70));
        if (platform.getAngle()  == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean lowerPlatform(boolean platformIsUp,Platform platform) {
        platform.setAngle(Math.max(platform.getAngle() - 1, 0));
        if (platform.getAngle() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
