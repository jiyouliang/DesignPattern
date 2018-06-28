package asimplefactory;

/**
 *
 */
public class MainClass {
    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.get();//生产苹果手机
//        Huawei huawei = new Huawei();
//        huawei.get();//生产华为手机
        IMobile huawei = MobileFactory.getMobile("huawei");
        huawei.get();
        IMobile apple = MobileFactory.getMobile("apple");
        apple.get();
    }
}
