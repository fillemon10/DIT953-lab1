package MovablePackage;

public class BinaryPlatformStrategy implements IPlatformLogic{
    @Override
    public boolean raisePlatform(double angle, boolean platformIsUp) {
        return true;
    }

    @Override
    public boolean lowerPlatform(double angle, boolean platformIsUp) {
        return false;
    }
}
