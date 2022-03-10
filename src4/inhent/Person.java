public class Person {
    private String name;
    private int age;

    public Person(){

    }//无参构造，因为已经有一个构造了，不加的话不会被编译器自动添加，为了防止遗忘，先加上

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name,int age){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}
