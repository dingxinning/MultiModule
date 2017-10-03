package ChainResponsibility;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
