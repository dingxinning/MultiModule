package Singleton;

import java.security.Signature;

/**
 * Created by Wuxiang on 2017/1/21.
 */
public class SingletonTest {

    public static void main(String[] args) {
        //Singleton无法实例化
        Singleton singleton = Singleton.getInstance();

//        System.out.println(singleton.readResolve());
    }
}
