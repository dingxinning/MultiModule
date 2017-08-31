package Factory.ManyFactory;

import Factory.MailSender;
import Factory.Sender;
import Factory.SmsSender;

/**
 * Created by Wuxiang on 2017/1/8.
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
