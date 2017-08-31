package com.collection;

/**
 * Created by Wuxiang on 2017/7/31.
 */
public class Template implements Comparable{
    private Integer id;
    private String name;

    public Template(Integer id, String name) {
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

    @Override
    public int compareTo(Object o) {
        Template template = (Template) o;
        return this.getId() - template.getId();
    }
}
