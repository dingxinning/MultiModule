package Mediator;

/**
 * Created by Wuxiang on 2017/10/4.
 */
public class User1 extends User{
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
