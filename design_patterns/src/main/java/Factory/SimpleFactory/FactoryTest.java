package Factory.SimpleFactory;

import Factory.Sender;

/*
普通工厂模式的实现
对实现了同一接口的一些类进行实例的创建
 */
public class FactoryTest {
	public static void main(String []args){
		SendFactory factory=new SendFactory();
		Sender senderSms= factory.produce("sms");
		senderSms.Send();
		Sender senderMail= factory.produce("mail");
		senderMail.Send();

        factory.produce("error");
    }
}
