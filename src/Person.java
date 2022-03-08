public class Person {
    String name;
    int age;
    float height;

    public void tell(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void daily(){
        this.eat();
        System.out.println("I'm studying");
    }

    public Person(){

    }

    public Person(String name){
        this.name = name;
        this.tell();
    }

    public Person(String name, float height){
        this(name);
        this.height = height;
        System.out.println("他也很高" + height);
    }
}


