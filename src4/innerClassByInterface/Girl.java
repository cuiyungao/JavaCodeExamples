public class Girl implements Daughter{

    @Override
    public void kind() {
        System.out.println("She's very kind");
    }

    @Override
    public void strong() {
        System.out.println("She's not strong");
    }

    @Override
    public void smart() {
        System.out.println("She's very smart");
    }

    public static void main(String[] args) {
        Girl g=new Girl();//由编译器自动添加
        g.kind();
        g.strong();
        g.smart();
    }
    //She's very kind
    //She's not strong
    //She's very smart

    //由接口的多继承后实现
}
