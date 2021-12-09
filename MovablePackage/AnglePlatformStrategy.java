package MovablePackage;

public class AnglePlatformStrategy implements IPlatformLogic {
    @Override
    public boolean raisePlatform(double angle, boolean platformIsUp) {
        angle = Math.min(angle + 1, 70);
        if (angle == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean lowerPlatform(double angle, boolean platformIsUp) {
        angle = Math.min(angle + -1, 70);
        if (angle == 0) {
            return false;
        } else {
            return true;
        }
    }
}
