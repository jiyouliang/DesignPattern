package bfactorymethod;

/**
 *
 */
public class XiaomiFactory implements MobileFactory {
    @Override
    public IMobile getMobile() {
        return new Xiaomi();
    }
}