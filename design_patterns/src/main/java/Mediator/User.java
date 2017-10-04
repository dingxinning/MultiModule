package Mediator;

/**
 * Created by Wuxiang on 2017/10/4.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
