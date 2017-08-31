package Adapter.ClassAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * 类适配器模式
 * 使得 Targetable接口的实现类（Adapter） 具有Source类的功能
 * Adapter类的method1()适配了Source类的method1()
 *
 * 应用：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 *      创建一个新类，继承原有的类，实现新的接口即可。
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
