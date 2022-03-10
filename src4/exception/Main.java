public class Main {
    public static void main(String[] args) {
        //异常的展示
        //1:
        String s="abc";//假设用户输入了abc
        int n=Integer.parseInt(s);//NumberFormatException!
        //这里用户希望输入一个int 类型的年龄，但是用户输入abc

        //2:
        //用户已经删除了这个文件
        //String t=readFile("C:\\abc.txt");//FileNotFoundException!
        //上面的readFile不是库函数，会直接报错
        //由于读不到这个文件也会发生异常

    }
}
