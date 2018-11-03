package chap02_factorymethod;

/**
 *
 */
public class XiaomiFactory implements MobileFactory {
    @Override
    public IMobile getMobile() {
        return new Xiaomi();
    }
}
