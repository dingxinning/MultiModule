package Proxy;

/**
 * Created by Wuxiang on 2017/3/19.
 * Source类是被装饰类
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
