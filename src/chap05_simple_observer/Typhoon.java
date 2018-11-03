package chap05_simple_observer;

import java.util.Observable;

/**
 * 台风类：被观察对象的具体实现
 * Observable为java.util提供的可被观察的类
 */
public class Typhoon extends Observable {

    public void landing() {
        System.out.println("台风即将登陆");
        setChanged();//标记被观察对象已经改变
        notifyObservers();//通知观察者
    }
}
