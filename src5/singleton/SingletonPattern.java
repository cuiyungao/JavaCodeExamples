package singleton;

public class SingletonPattern {
    public static void main(String[] args){
        for (int i=0; i<5; i++) {
            new Thread(() -> {Singeton.getInstance();}).start();
        }
    }
}

class Singeton{
    //饿汉式
//    private static Singeton singleton = new Singeton();
//    private Singeton(){
//        System.out.println("hello");
//    }  //构造方法一定是私有的
//
//    public static Singeton getInstance(){
//        return singleton;
//    }

    //懒汉式 -- 同步锁
    private static Singeton singeton;
    private Singeton(){
        System.out.println("hello");
    }

    public synchronized static Singeton getInstance() {
        if (singeton == null)
            singeton = new Singeton();
        return singeton;
    }

    //饿汉式 -- 双重检查锁
//    private static Singeton singeton;
//    private Singeton(){
//        System.out.println("hello");
//    }
//
//    public static Singeton getInstance(){
//        if(singeton == null)
//            synchronized (Singeton.class) {
//                if(singeton == null)
//                singeton = new Singeton();
//            }
//        return singeton;
//    }
}
