package State;

/**
 * Created by Wuxiang on 2017/10/4.
 * 状态模式
 * 当对象的状态改变时，同时改变其行为
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
