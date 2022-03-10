public class Student extends Person{
    int age=18;

    public Student(){

    }

    public Student(String name,int age){
        super(name,age);//调用父类含有两个参数的构造方法
    }

    public void display(){
        System.out.println("学生年龄是:"+super.age);//为了展示super访问字段的方法所以将age的访问权放大了变成了包访问劝
    }

    public void getTarget(){
        System.out.println("功夫到家");
    }

    public void displayTarget(){
        System.out.print("身为人的目标:");
        super.getTarget();
        System.out.print("身为学生的目标:");
        this.getTarget();
    }
}