package Adapter.InterfaceAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * 在抽象类中实现 接口的部分方法
 *
 * 应用：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，
 *    实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable sub1 = new SourceSub1();
        Sourceable sub2 = new SourceSub2();

        sub1.method1();
        sub1.method2();
        sub2.method1();
        sub2.method2();
    }
}
