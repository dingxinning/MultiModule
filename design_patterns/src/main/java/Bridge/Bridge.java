package Bridge;

/**
 * Created by Wuxiang on 2017/3/19.
 * 定义一个桥，持有Sourceable的一个实例
 */
public class Bridge {
    private Sourceable sourceable;

    public void method() {
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
