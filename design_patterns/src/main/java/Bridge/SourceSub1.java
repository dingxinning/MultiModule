package Bridge;


/**
 * Created by yxrsw on 2017/2/13.
 * 继承了抽象类 Wrapper
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
