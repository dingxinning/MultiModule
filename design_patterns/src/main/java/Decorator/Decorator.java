package Decorator;

/**
 * Created by Wuxiang on 2017/3/19.
 * Decorator类是一个装饰类
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        //可以为source类动态的增加功能
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
