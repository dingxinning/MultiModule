package com.cglib;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Wuxiang on 2017/10/19.
 */
public class DynamicBean {
    private Object object = null;//动态生成的类
    private BeanMap beanMap = null;//存放属性名称以及属性的类型

    public DynamicBean() {
        super();
    }

    @SuppressWarnings("rawtypes")
    public DynamicBean(Map propertyMap) {
        this.object = generateBean(propertyMap);
        this.beanMap = BeanMap.create(this.object);
    }

    /**
     * 给bean属性赋值
     *
     * @param property 属性名
     * @param value    值
     */
    public void setValue(Object property, Object value) {
        beanMap.put(property, value);
    }

    /**
     * 通过属性名得到属性值
     *
     * @param property 属性名
     * @return 值
     */
    public Object getValue(String property) {
        return beanMap.get(property);
    }

    @Override
    public String toString() {
        return "DynamicBean{" +
                "object=" + object +
                ", beanMap=" + beanMap +
                '}';
    }

    /**
     * 得到该实体bean对象
     *
     * @return
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @param propertyMap
     * @return
     */
    @SuppressWarnings("rawtypes")
    private Object generateBean(Map propertyMap) {
        BeanGenerator generator = new BeanGenerator();
        Set keySet = propertyMap.keySet();
        for (Iterator i = keySet.iterator(); i.hasNext(); ) {
            String key = (String) i.next();
            generator.addProperty(key, (Class) propertyMap.get(key));
        }
        return generator.create();
    }
}
