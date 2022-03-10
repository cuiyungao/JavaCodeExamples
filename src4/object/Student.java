public class Student extends Object{
    //事实上所有的类都继承自Object类
    //就算不写extends Obeject也是ok的
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
