public class Main {

    public static void getMission(Person p){
        System.out.print("the mission of the person is:");
        p.getMission();
    }

    public static void main(String[] args) {
        //Person p=new Person();//error不能用于直接初始化
        Person p1 = new Student();
        Person p2 = new Teacher();
        getMission(p1);
        getMission(p2);
    }
//    the mission of the person is:为中华之崛起而读书
//    the mission of the person is:立德树人

//    抽象类一样具有多态性
}
