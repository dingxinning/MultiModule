import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2017/1/26.
 */
public class LearnJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!!!");

        // object 转 string， 若为null，  直接toString ，抛异常
        Object object = null;

//        System.out.println(object.toString());
        System.out.println((String) object);


        List<String> tizhong = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            tizhong.add(null);
        }

        tizhong.set(2, "123");

        System.out.println(tizhong);
    }
}
