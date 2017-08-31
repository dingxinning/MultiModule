package Adapter.ObjectAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * Targetable的实现类，没有继承source，而是包含了source的对象，实现适配的功能
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
