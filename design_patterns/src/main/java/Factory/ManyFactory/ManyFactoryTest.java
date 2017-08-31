package Factory.ManyFactory;

import Factory.Sender;

/**
 * Created by Wuxiang on 2017/1/8.
 * 多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class ManyFactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
        Sender sender1 = factory.produceSms();
        sender1.Send();
    }
}
