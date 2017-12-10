package basic.thread;

import java.io.*;

public class SerializeTest {
    static class Student implements Serializable{
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        Student student = new Student("张三", 20);
        // 将java对象转换为字节流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // 将字节数组输入流包装为ObjectOutputStream
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            // 将对象写入objectOutputStream
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            outputStream.close();
            // 返回字节数组输出流中的字节数组
            System.out.println(outputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Student student1 = (Student) objectInputStream.readObject();
            System.out.println(student1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
