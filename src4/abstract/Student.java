public class Student extends Person{

    //这里有一个Override注解，这个不是一个注释，是一个有意义的东西
    //如果getMission并没有重写任何方法编译器会报错
    //比如ta的父类中的方法是一个private，如果不加注解就会误以为重写了
    @Override
    public void getMission() {
        System.out.println("为中华之崛起而读书");
    }
}
