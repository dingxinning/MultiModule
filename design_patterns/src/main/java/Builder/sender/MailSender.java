package Builder.sender;

/**
 * Created by Wuxiang on 2017/1/8.
 * 发送邮件的实现类
 */
public class MailSender implements Sender {
	@Override
	public void Send(){
		System.out.println("this is mail sender!");
	}
}
