package com.reflection_new.five_factory;

import com.reflection_new.five_factory.entity.Fruit;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class FactoryByReflect {

    public  static Fruit getInstance(String className){
        Fruit f = null;
        try{
            f = (Fruit) Class.forName(className).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
