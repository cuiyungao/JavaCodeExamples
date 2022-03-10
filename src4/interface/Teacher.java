public class Teacher implements Person{

    private String name;
    private int age;

    @Override
    public void getDuty() {
        System.out.println("科研教学");
    }

    @Override
    public void getMission() {
        System.out.println("立德树人");
    }
}
