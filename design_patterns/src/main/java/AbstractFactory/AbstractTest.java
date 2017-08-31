package AbstractFactory;

import AbstractFactory.MyAddFactory.SendFacebookFactory;

/**
 * Created by Wuxiang on 2017/1/8.
 * 抽象工厂模式
 * （工厂方法模式有一个问题就是，类的创建依赖工厂类）
 * 而抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码
 */
public class AbstractTest {
    public static void main(String []args){
        Provider provider = new SendMailFactory();
        Sender sender=provider.produce();
        sender.Send();

        //尝试新增一个工厂
        SendFacebookFactory facebookFactory = new SendFacebookFactory();
        Sender sender1 = facebookFactory.produce();
        sender1.Send();
    }
}
