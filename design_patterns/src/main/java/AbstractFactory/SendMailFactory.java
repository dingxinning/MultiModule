package AbstractFactory;

/**
 * Created by Wuxiang on 2017/1/8.
 */
public class SendMailFactory  implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
