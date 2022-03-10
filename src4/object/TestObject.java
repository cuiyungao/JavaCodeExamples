public class TestObject {
    public static void main(String[] args) {
        Object obj=new Student("张三",19);
        Student stu=(Student) obj;//可以使用强制向上转型
        System.out.println("stu's name:"+stu.getName());
        System.out.println("stu's age:"+stu.getAge());
        System.out.println("--------------------------");

        //---------------------------------------------
        //equal
        //创建两个对象
        Object student_1=new Student("Zhangsan",19);
        Object student_2=new Student("Lisi",18);

        //不同的对象，内存地址不同，不相等，返回false
        System.out.println(student_1.equals(student_2));//实际上这里只是比较了引用是否相等

        //对象引用，内存地址相同，相等，返回true
        Student student_3=(Student) student_1;
        System.out.println(student_1.equals(student_3));
    }
}