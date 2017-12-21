package algorithm;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
      // System.out.println(SubClass.value);
  //      SuperClass[] subClasses = new SuperClass[10];

        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (null == is){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e){
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Object obj = classLoader.loadClass("algorithm.Test").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof algorithm.Test );

    }
}
