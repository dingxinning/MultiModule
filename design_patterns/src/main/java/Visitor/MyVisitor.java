package Visitor;

/**
 * Created by Wuxiang on 2017/10/4.
 *
 * Visitor类 存放要访问的对象
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject：" + sub.getSubject());
    }
}
