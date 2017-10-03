package Observer;

/**
 * Created by Wuxiang on 2017/7/21.
 *
 * 主对象
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
