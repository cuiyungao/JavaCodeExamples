public class Student implements Person{

    private String name;
    private int age;

    @Override
    public void getDuty() {
        System.out.println("好好学习");
    }

    @Override
    public void getMission() {
        System.out.println("为中华之崛起而读书");
    }
}
