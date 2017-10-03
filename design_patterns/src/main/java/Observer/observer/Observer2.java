package Observer.observer;

/**
 * Created by Wuxiang on 2017/7/21.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者2收到更新!");
    }
}
