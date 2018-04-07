package com.multi.project.imooc_3_adapter;

/**
 * Created by Wuxiang on 2018/4/7
 *
 *  现在有的物品是： 二相插孔、电脑（只支持三相插头），
 *  其中，电脑的供电只能有三相插头的供电方法进行。
 *  问题是怎么给电脑供电。
 *  所以，我们借助了一个适配器（二相转三相）实现三相插头的供电方法，
 *  而这个适配器本质上是输入二相，转化为三相，
 *  所以，构建这个适配器需要一个二相插孔参数，
 *  适配器实现的三相供电方法，其实就是在方法里使用了二相插孔的供电方法，这样，笔记本就有电了。
 */
public class NoteBook {

    private PlugThree plug;

    public NoteBook(PlugThree plug){
        this.plug = plug;
    }

    // 使用插座充电
    public void charge(){
        plug.powerWithThree();
    }

    public static void main(String[] args) {
        PlugTwo two =  new PlugTwo();

        // 通过组合的方式实现
        PlugThree three = new PlugTwoAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();

        System.out.println("\n***********************\n");

        // 通过继承的方式实现
        three = new PlugTwoAdapterExtends();
        nb = new NoteBook(three);
        nb.charge();
    }

}
