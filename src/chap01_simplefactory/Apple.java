package chap01_simplefactory;

/**
 * 苹果手机
 */
public class Apple implements IMobile {

    @Override
    public void produce() {
        System.out.println("生产苹果手机");
    }
}
