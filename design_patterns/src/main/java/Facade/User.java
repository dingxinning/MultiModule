package Facade;

/**
 * Created by Wuxiang on 2017/3/19.
 * 外观模式主要的目的就是降低了类类之间的耦合度
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startUp();
        computer.shutDown();
    }
}
