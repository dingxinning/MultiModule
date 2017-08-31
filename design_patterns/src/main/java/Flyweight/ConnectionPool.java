package Flyweight;

/**
 * Created by Wuxiang on 2017/3/19.
 * 适用于作共享的一些个对象，他们有一些共有的属性，就拿数据库连接池来说，
 * url、driverClassName、username、password及dbname，
 * 这些属性对于每个连接来说都是一样的，所以就适合用享元模式来处理，
 * 建一个工厂类，将上述类似属性作为内部数据，其它的作为外部数据，
 * 在方法调用时，当做参数传进来，这样就节省了空间，减少了实例的数量。
 */
public class ConnectionPool {
    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

}
