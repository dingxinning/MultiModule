package Adapter.ObjectAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * 对象的适配器模式
 * 持有Source类的实例，以达到解决兼容性的问题
 *
 * 应用：：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
 * 持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
