package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/1/22.
 * 建造者类
 */
public class Builder {
    private List<Sender> list=new ArrayList<Sender>();

    //将list返回，以供调用
    public List<Sender> produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
        return list;
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
