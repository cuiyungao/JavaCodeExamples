//继承的多态性测试
public class PolymorphismTest {
    public static void getInformation(Person p){
        System.out.println("这个人名字是:"+p.getName());
        System.out.println("这个人年龄是:"+p.getAge());
    }

    public static void main(String[] args) {
        Person p1=new Student("小红",13,"hit");
        Person p2=new Teacher("小绿",81,"thu");
        getInformation(p1);
        getInformation(p2);
    }
    //这个人名字是:小红
    //这个人年龄是:13
    //这个人名字是:小绿
    //这个人年龄是:81

    //-----------------------------------
    //具有多态性
}
