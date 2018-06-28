package bfactorymethod;

/**
 * 苹果手机
 */
public class Apple implements IMobile {

    @Override
    public void get() {
        System.out.println("生产苹果手机");
    }
}
