public class Main {
    public static void getDuty(Person p){
        p.getDuty();
    }

    public static void getMission(Person p){
        p.getMission();
    }

    public static void main(String[] args) {
        System.out.print("学生的职责是:");
        getDuty(new Student());
        //为了方便所以使用了匿名类
        System.out.print("老师的职责是:");
        getDuty(new Teacher());

        System.out.print("学生的使命是:");
        getMission(new Student());
        System.out.print("老师的使命是:");
        getMission(new Teacher());
    }
    //学生的职责是:好好学习
    //老师的职责是:科研教学
    //学生的使命是:为中华之崛起而读书
    //老师的使命是:立德树人
}
