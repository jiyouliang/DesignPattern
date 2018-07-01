package cabstractfactory;

/**
 * 手机工厂
 */
public interface MobileFactory {
    /**生成小米手机*/
    IMobile produceXiaomi();
    /**生产华为手机*/
    IMobile produceHuawei();
    /**生产苹果手机*/
    IMobile produceApple();
}
