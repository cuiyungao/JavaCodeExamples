package src11.Generic;

public class GenericDurian {
    public static void main(String[] args) {
        // 由于传给T形参的是String，所以构造器参数只能是String
        Durian<String> a1 = new Durian<>("猫山王");
        System.out.println(a1.getInfo());

        // 由于传给T形参的是Double，所以构造器参数只能是Double
        Durian<Double> a2 = new Durian<>(1.23);
        System.out.println(a2.getInfo());

        // 调用静态方法
        Durian<Integer> a3 = Durian.readyear(2022);
        System.out.println(a3.getInfo());
    }
}