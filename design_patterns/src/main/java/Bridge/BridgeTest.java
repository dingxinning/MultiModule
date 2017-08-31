package Bridge;

/**
 * Created by Wuxiang on 2017/3/19.
 * 通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSourceable(source1);
        bridge.method();
        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSourceable(source2);
        bridge.method();
    }
}
