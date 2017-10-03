package Observer;

import Observer.observer.Observer1;
import Observer.observer.Observer2;

/**
 * Created by Wuxiang on 2017/7/21.
 * 观察者模式
 * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象
 * 当MySubject变化时，Observer1和Observer2必然变化。
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
