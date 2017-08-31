package Adapter.ClassAdapter;

/**
 * Created by yxrsw on 2017/2/13.
 * Adapter类继承Source类，实现Targetable接口
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
