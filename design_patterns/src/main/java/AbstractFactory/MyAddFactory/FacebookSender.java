package AbstractFactory.MyAddFactory;

import AbstractFactory.Sender;

/**
 * Created by Wuxiang on 2017/1/8.
 */
public class FacebookSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is FaceBook sender!");
    }
}
