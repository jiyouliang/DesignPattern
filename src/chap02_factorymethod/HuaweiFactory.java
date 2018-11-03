package chap02_factorymethod;

/**
 * 华为手机工厂
 */
public class HuaweiFactory implements MobileFactory {
    @Override
    public IMobile getMobile() {
        return new Huawei();
    }
}
