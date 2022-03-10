public class Main {
    public static void main(String[] args) {
        Son s=new Son();
        System.out.println("son's strong is:"+s.getStrong());
        System.out.println("son's smart is:"+s.getSmart());
        //son's strong is:10
        //son's smart is:9

        //可以通过内部类的方法实现(伪)多继承
    }
}
