package chap01_simplefactory;

/**
 * 华为手机
 */
public class Huawei implements IMobile{

    @Override
    public void produce() {
        System.out.println("生产华为手机");
    }
}
