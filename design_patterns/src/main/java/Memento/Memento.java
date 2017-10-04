package Memento;

/**
 * Created by Wuxiang on 2017/10/4.
 * 备忘录类
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
