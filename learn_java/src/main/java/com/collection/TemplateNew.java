package com.collection;

/**
 * Created by Wuxiang on 2017/7/31.
 */
public class TemplateNew {
    private Integer id;
    private String name;

    public TemplateNew(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Template{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
