package src11.Generic;

public class ShowInterfaceTest {
    public static void main(String[] args) {
        //实现类已确定类型
        ShowClass1 obj = new ShowClass1();
        obj.show("java"); // test "java" to 7

        //实现类未确定类型，使用时确定
        ShowClass2<Integer> Obj = new ShowClass2<>();
        Obj.show(7);
    }

}
