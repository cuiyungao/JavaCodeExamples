public abstract class Person {
    private String name;

    //普通方法
    public String getName(){
        return name;
    }

    //抽象方法
    //没有方法体，用abstract修饰
    public abstract void getMission();
}
