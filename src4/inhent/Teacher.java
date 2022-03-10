public class Teacher extends Person{
    private String office;

    public Teacher(){

    }

    public Teacher(String name,int age,String office){
        super(name,age);
        this.office=office;
    }

    public String getOffice(){
        return office;
    }

    public static void main(String[] args) {
        Teacher tch=new Teacher("张老师",19,"衡水中学");
        System.out.println("这个老师名字是:"+tch.getName());//这个老师名字是:张老师
        System.out.println("这个老师年龄是:"+tch.getAge()+"岁");//这个老师年龄是:19岁
        System.out.println("这个老师工作地点是:"+tch.getOffice());//这个老师工作地点是:衡水中学
    }
}
