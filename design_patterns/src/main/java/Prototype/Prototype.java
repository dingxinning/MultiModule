package Prototype;

import java.io.*;

/**
 * Created by Wuxiang on 2017/1/22.
 * 原型类
 */
public class Prototype implements Cloneable {
    private static final long serialVersionUID = 1L;
    private String string;
    private SerializableObject obj;

    /*
    浅拷贝
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /*
    深拷贝
     */
    public Object deepClone() throws IOException,ClassNotFoundException{
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
