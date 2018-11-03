package chap05_simple_observer;

/**
 * 简单观察者模式
 */
public class AppClient {
    public static void main(String[] args) {
        Typhoon subject = new Typhoon();

        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();
        subject.addObserver(observerA);
        subject.addObserver(observerB);

        subject.landing();
    }
}
