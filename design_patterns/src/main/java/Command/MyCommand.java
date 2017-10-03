package Command;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
