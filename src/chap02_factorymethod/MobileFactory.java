package chap02_factorymethod;

/**
 *手机工厂
 */
public interface MobileFactory {
    /**生产手机*/
    public IMobile getMobile();
}
