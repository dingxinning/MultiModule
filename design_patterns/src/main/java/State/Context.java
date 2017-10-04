package State;

/**
 * Created by Wuxiang on 2017/10/4.
 * 状态模式的切换类
 *
 * state1时，调用methed1
 * state2时，调用methed2
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
