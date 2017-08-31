package AbstractFactory.MyAddFactory;

import AbstractFactory.Provider;
import AbstractFactory.Sender;

/**
 * Created by Wuxiang on 2017/1/8.
 */
public class SendFacebookFactory  implements Provider {
    @Override
    public Sender produce() {
        return new FacebookSender();
    }
}
