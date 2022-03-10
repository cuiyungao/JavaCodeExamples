public class Student extends Person{

    //super(name,age)//ppt写错了
    private String school;


    public Student(){

    }

    public Student(String name,int age,String school){
        super(name,age);
        this.school=school;
    }

    public String getSchool(){
        return this.school;
    }

    public static void main(String[] args) {
        //System.out.println(Student.name);//error
        Student stu=new Student("小明",12,"小学");
        System.out.println("这个学生是:"+stu.getName());//这个学生是:小明
        System.out.println("这个学生年龄是:"+stu.getAge()+"岁");//这个学生年龄是:12岁
        System.out.println("这个学生读的是:"+stu.getSchool());//这个学生读的是:小学
    }

}
