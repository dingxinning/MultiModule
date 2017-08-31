package com.learn.entity;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Person{
    private int id;
    private String name;
    private boolean status;

    public Person(int id,String name,boolean status){
        this.id=id;
        this.name=name;
        this.status=status;
        System.out.println("id="+id+",name="+name+",status="+status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
