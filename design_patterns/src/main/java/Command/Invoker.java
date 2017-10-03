package Command;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exec();
    }
}
