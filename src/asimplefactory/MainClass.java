package asimplefactory;

/**
 *
 */
public class MainClass {
    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.produce();//生产苹果手机
//        Huawei huawei = new Huawei();
//        huawei.produce();//生产华为手机
        IMobile huawei = MobileFactory.getMobile("huawei");
        huawei.produce();
        IMobile apple = MobileFactory.getMobile("apple");
        apple.produce();
    }
}
