package designPattern.peototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date();
        Sheep s1 = new Sheep("原型羊", date);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);

        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep)ois.readObject();
        System.out.println(s1);
        System.out.println(s2);

    }
}
