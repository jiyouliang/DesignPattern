package bfactorymethod;

/**
 * 苹果手机工厂
 */
public class AppleFactory implements MobileFactory {
    @Override
    public IMobile getMobile() {
        return new Apple();
    }
}
