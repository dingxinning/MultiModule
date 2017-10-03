package Builder;

import Builder.sender.MailSender;
import Builder.sender.Sender;
import Builder.sender.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/1/22.
 * 建造者类
 */
public class Builder {
    //将list返回，以供调用
    public List<Sender> produceMailSender(int count) {
        List<Sender> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
        return list;
    }

    public List<Sender> produceSmsSender(int count) {
        List<Sender> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
        return list;
    }
}
