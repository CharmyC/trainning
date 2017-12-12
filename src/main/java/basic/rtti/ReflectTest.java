package basic.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by zhuanli.cheng on 2017/12/12.
 */
public class ReflectTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> c = Student.class;
        Field[] fields = c.getDeclaredFields();
        Student student = (Student) c.newInstance();
        //student.setId("20");
        student.setName("cccc");
        System.out.println("===================Field===============");
        for (Field field : fields){
            field.setAccessible(true);
            System.out.println(field.toString());
            Object value = field.get(student);
            System.out.println(field.get(student));
            field.set(student, "30");
            System.out.println(student);
        }
        System.out.println("===================Method===============");
        Method[] methods = c.getMethods();
        for (Method method : methods){
            method.setAccessible(true);
            Type[] types = method.getTypeParameters();
            System.out.println(types);

            //method.invoke(student, args);
            System.out.println(method.toString());
        }
        System.out.println("===================Constructor===============");
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.toString());
        }
    }

}
