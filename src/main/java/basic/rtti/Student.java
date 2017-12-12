package basic.rtti;

/**
 * Created by zhuanli.cheng on 2017/12/12.
 */
public class Student {
    protected String name;
    private final String id = "";

//    private Student(){
//
//    }
//    public Student(String name, String id) {
//        this.name = name;
//        this.id = id;
//    }

    private String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
