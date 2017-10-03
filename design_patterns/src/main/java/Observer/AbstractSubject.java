package Observer;

import Observer.observer.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Wuxiang on 2017/7/21.
 *
 * AbstractSubject类中定义着需要监控的对象列表，
 * 可以对其进行修改：增加或删除被监控对象，
 * 且当MySubject变化时，负责通知在列表内存在的对象。
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            // 执行update
            enumo.nextElement().update();
        }
    }
}
