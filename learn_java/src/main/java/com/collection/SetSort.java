package com.collection;

import com.collection.entity.Template;
import com.collection.entity.TemplateNew;

import java.util.*;

/**
 * Created by Wuxiang on 2017/7/31.
 * HashSet 提供最快的查找技术，保存无顺序
 * TreeSet 按照结果的升序保存 key
 * LinkedHashSet  按照被添加的顺序保存对象
 */
public class SetSort {
    public static void main(String[] args) {
        Template template = new Template(1, "aaa");
        Template template1=new Template(4,"asd");
        Template template2=new Template(5,"asd");
        Template template3=new Template(3,"asd");
        Template template7=new Template(3,"asd11111");
        Template template4=new Template(2,"asd");
        Template template5=new Template(6,"asd");

        Set set = new TreeSet();
        set.add(template);
        set.add(template1);
        set.add(template2);
        set.add(template3);
        set.add(template7);
        set.add(template4);
        set.add(template5);
        System.out.println(set);


        Set set1 = new HashSet();
        set1.add(new TemplateNew(1,"asd"));
        set1.add(new TemplateNew(5,"asd"));
        set1.add(new TemplateNew(2,"asd"));
        set1.add(new TemplateNew(4,"asd"));
        set1.add(new TemplateNew(3,"asd"));
        set1.add(new TemplateNew(7,"asd"));
        System.out.println(set1);

        List<TemplateNew> templateNews =new ArrayList<TemplateNew>(set1);

        Collections.sort(templateNews, new Comparator<TemplateNew>() {
            @Override
            public int compare(TemplateNew o1, TemplateNew o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        templateNews.forEach(templateNew -> System.out.println(templateNew.toString()));

    }
}
