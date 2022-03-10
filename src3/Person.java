public class Person {
    private String name;
    private int age;
    static String country="A城";

    //--------------------------------------------------------
    //以下是一个初始化演示，代码先注释，防止影响后续main函数调用输出

//这个初始化方法放在构造方法之上是提醒static初始化比构造方法先被调用，只有在类被载入的时候会被调用一次
//后续构造对象不会影响
//    static long totalNum;//代表总人数与具体对象无关

//    static{
//        totalNum=10000;
//        System.out.println("类static初始化方法被调用");
//    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }


    public static void setCountry(String country) {
        Person.country = country;
        //name=country;//这句就是调用了对象的用法会报错
        //this.country=country;//哪怕是想调用this里面的静态属性也是错误的
    }//static方法只能使用static属性，由此也可以知道构造方法本身也是static的



    public static void main(String[] args) {
        Person p1=new Person("张三",20);
        Person p2=new Person("李四",21);
        Person p3=new Person("王五",22);
        System.out.println("张三的country:"+p1.country);//张三的country:A城
        System.out.println("李四的country:"+p2.country);//李四的country:A城
        System.out.println("王五的country:"+p3.country);//王五的country:A城
        System.out.println("Person类的country:"+Person.country);//Person类的country:A城

        //---------------------------------------------------------------
        //关于课上同学提问的country是否可以修改的代码
        p1.country="B城";
        System.out.println("Person类的country:"+Person.country);//Person类的country:B城

        //---------------------------------------------------------------
        //这个技术可以非常方便地对产生的对象进行计数，如设置一个count，在构造方法中加一
        //每次构造的时候都会进行加一操作

        //---------------------------------------------------------------
        //使用static方法
        Person.setCountry("C城");
        System.out.println("使用静态方法setCountry后的country:"+Person.country);//使用静态方法setCountry后的country:C城
    }
}
