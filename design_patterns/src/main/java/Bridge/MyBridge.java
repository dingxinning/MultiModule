package Bridge;

/**
 * Created by Wuxiang on 2017/3/19.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSourceable().method();
    }
}
