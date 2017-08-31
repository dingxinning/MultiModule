package Builder;

/**
 * Created by Wuxiang on 2017/1/8.
 * 发送短信的实现类
 */
public class SmsSender implements Sender {
	@Override
	public void Send(){
		System.out.println("this is sms sender!");
	}
}
