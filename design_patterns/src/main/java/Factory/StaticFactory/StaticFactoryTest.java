package Factory.StaticFactory;

import Factory.Sender;

/**
 * Created by Wuxiang on 2017/1/8.
 * 静态工厂方法模式
 * 将多个工厂方法模式中的方法置为静态的，不需要创建实例，直接调用即可
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
        Sender sender1 = factory.produceSms();
        sender1.Send();
    }
}
