package com.serializable;

import com.serializable.entity.Student;

import java.io.*;

/**
 * Created by Wuxiang on 2017/1/11.
 * 实现学生类实例的序列化与反序列化
 * 先把student对象序列化到txt文件，再从文件反序列化出对象
 */
public class UseStudent {
    public static void main(String[] args) {
        Student student = new Student("wxx", 'M', 2017, 2.8);
        File file=new File("D:\\serializable.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try
        {
            //Student对象序列化过程
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            fos.close();

            //Student对象反序列化过程
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student st1 = (Student) ois.readObject();
            System.out.println("name = " + st1.getName());
            System.out.println("sex = " + st1.getSex());
            System.out.println("year = " + st1.getYear());
            System.out.println("gpa = " + st1.getGpa());
            ois.close();
            fis.close();
        }
        catch(ClassNotFoundException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
