package cabstractfactory;

/**
 *
 */
public class MainClass {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IMobile huawei = huaweiFactory.getMobile();
        huawei.produce();//生产华为手机

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IMobile xiaomi = xiaomiFactory.getMobile();
        xiaomi.produce();

    }
}
