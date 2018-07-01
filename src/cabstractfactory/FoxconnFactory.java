package cabstractfactory;

/**
 * 富士康工厂
 */
public class FoxconnFactory implements MobileFactory {
    @Override
    public Xiaomi produceXiaomi() {
        return new Xiaomi();
    }

    @Override
    public Huawei produceHuawei() {
        return new Huawei();
    }

    @Override
    public IMobile produceApple() {
        return new Apple();
    }
}
