package cabstractfactory;

/**
 *
 */
public class Xiaomi implements IMobile {
    @Override
    public void produce() {
        System.out.println("生成小米手机");
    }
}
