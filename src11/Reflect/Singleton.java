package Reflect;
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
   //  if(singleton != null) {
   //      throw new RuntimeException("单例构造器禁止通过反射调用");
   // }
}
    public static Singleton getInstance(){
        return singleton;
    }
}
