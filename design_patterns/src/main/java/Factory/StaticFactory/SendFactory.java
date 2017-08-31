package Factory.StaticFactory;

import Factory.MailSender;
import Factory.Sender;
import Factory.SmsSender;

/**
 * Created by Wuxiang on 2017/1/8.
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
