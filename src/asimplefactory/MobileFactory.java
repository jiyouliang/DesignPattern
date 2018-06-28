package asimplefactory;

/**
 * 生成手机的工厂
 */
public class MobileFactory {

    public static IMobile getMobile(String type) {
        IMobile mobile = null;
        if ("huawei".equalsIgnoreCase(type)) {
            mobile = new Huawei();
        } else if ("apple".equalsIgnoreCase(type)) {
            mobile = new Apple();
        }
        return mobile;
    }
}
