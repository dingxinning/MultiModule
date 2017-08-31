package Adapter.InterfaceAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * Wrapper类实现了接口中的全部方法，并将类设置为抽象类
 */
public abstract class Wrapper implements Sourceable {

    @Override
    public void method1() {
        System.out.println("默认方法1");
    }

    @Override
    public void method2() {
        System.out.println("默认方法2");
    }
}
