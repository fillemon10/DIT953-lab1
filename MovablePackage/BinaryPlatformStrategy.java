package MovablePackage;

public class BinaryPlatformStrategy implements IPlatformLogic{
    @Override
    public boolean raisePlatform(boolean platformIsUp, Platform platform) {
        return true;
    }

    @Override
    public boolean lowerPlatform(boolean platformIsUp, Platform platform) {
        return false;
    }
}
