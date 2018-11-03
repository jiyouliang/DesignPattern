package chap05_simple_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("广州收到台风登陆信息，做好防台风准备！");
    }
}
