package Observer;

/**
 * Created by Wuxiang on 2017/7/21.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
