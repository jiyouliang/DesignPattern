package chap03_abstractfactory;

/**
 *
 */
public class MainClass {
    public static void main(String[] args) {
        MobileFactory factory = new FoxconnFactory();
        IMobile huawei = factory.produceHuawei();
        huawei.produce();

        IMobile xiaomi = factory.produceXiaomi();
        xiaomi.produce();

        IMobile apple = factory.produceApple();
        apple.produce();
    }
}
