package Mediator;

/**
 * Created by Wuxiang on 2017/10/4.
 *
 * 具体类类之间的关系及调度交给Mediator
 */
public class MyMediator implements Mediator{
    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
