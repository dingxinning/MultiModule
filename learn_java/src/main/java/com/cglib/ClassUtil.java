package com.cglib;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Wuxiang on 2017/10/19.
 */
public class ClassUtil {
    private String filepath = "/config/";//配置文件路径

    public String getFilepath() {
        return filepath;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public DynamicBean dynamicClass(Object object, Set<String> keylist) throws Exception {
        HashMap returnMap = new HashMap();
        HashMap typeMap = new HashMap();
//        //读取配置文件
//        Properties prop = new Properties();
//        String sourcepackage = object.getClass().getName();
//        String classname = sourcepackage.substring(sourcepackage.lastIndexOf(".") + 1);
//        InputStream in = ClassUtil.class.getResourceAsStream(getFilepath() + classname + ".properties");
//        prop.load(in);
//        Set<String> keylist = prop.stringPropertyNames();

        Class type = object.getClass();
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < propertyDescriptors.length; i++) {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            if (!propertyName.equals("class")) {
                Method readMethod = descriptor.getReadMethod();
                Object result = readMethod.invoke(object, new Object[0]);
                if (result != null) {
                    returnMap.put(propertyName, result);
                } else {
                    returnMap.put(propertyName, "");
                }
                typeMap.put(propertyName, descriptor.getPropertyType());
            }
        }
        //加载配置文件中的属性
        Iterator<String> iterator = keylist.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            typeMap.put(key, Class.forName("java.lang.String"));
        }
        //map转换成实体对象
        return new DynamicBean(typeMap);
    }
}