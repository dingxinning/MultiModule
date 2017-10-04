package Visitor;

/**
 * Created by Wuxiang on 2017/10/4.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
