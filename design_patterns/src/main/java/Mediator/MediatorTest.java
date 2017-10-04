package Mediator;

/**
 * Created by Wuxiang on 2017/10/4.
 * 中介者模式
 * 用来降低类类之间的耦合
 *
 * 具体类类之间的关系及调度交给Mediator就行
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
