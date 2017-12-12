package basic.rtti;

/**
 * Created by zhuanli.cheng on 2017/12/11.
 */
public class ClassTest {
    interface HasBatteries {
    }

    interface Waterproof {
    }

    interface Shoots {
    }

    static class Toy {
        Toy() {
        }

        Toy(int i) {
        }
    }

    class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
        FancyToy() {
            super(1);
        }
    }

    public static void printInfo(Class cc){
        System.out.println("Class name :" + cc.getName() + "is interface:" + cc.isInterface());
        System.out.println("Simple name :" + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("basic.rtti.ClassTest$FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
        System.out.println("isAssignableFrom :" + c.isAssignableFrom(Toy.class));
        for (Class face : c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance(); //对象内部类不能创建成功
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        printInfo(object.getClass());
    }
}
