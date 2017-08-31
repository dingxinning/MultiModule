package Builder;

import java.util.List;

/**
 * Created by Wuxiang on 2017/1/22.
 * 建造者模式则是将各种产品集中起来进行管理，用来创建复合对象
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();

        int mailNumber = 5;
        List <Sender> senderList=builder.produceMailSender(mailNumber);
        for (Sender sender : senderList) {
            sender.Send();
        }
    }
}
