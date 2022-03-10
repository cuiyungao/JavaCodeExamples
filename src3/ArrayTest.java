import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //数组的定义和初始化,赋值
        int [] ns;
        ns =new int[]{1,2,3,4,5,6,7};
        System.out.println("修改前数组长度:"+ns.length);//修改前数组长度:7

        ns=new int[]{8,9,10};
        System.out.println("修改后的数组长度"+ns.length);//修改后的数组长度:3

        //----------------------------------------------
        //思考打印值(看PPT)
        String[] names={"HIT","SZ","C++"};
        String s=names[2];
        names[2]="JAVA";
        System.out.println(s);//C++

        //----------------------------------------------
        //forecah使用
        int[] ns2={1,4,9,16,25};
        for(int i=0;i<ns2.length;i++){
            int n=ns2[i];
            System.out.println(n);
        }//1 4 9 16 25
        System.out.println("---------------------------");
        for(int n:ns2){
            System.out.println(n);
        }//1 4 9 16 25
        System.out.println("---------------------------");
        //foreach中不能修改数组元素，不能知道当前打印元素的索引
        //关于不能修改数组元素的原因，源码中可以发现如果在其中删改了数组元素可能会影响数组长度，详情STFW

        //-----------------------------------------------
        //排序
        int[] ns3={2,1,9,7,5};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns3));
        //1,2,5,7,9

        //-----------------------------------------------
        //多维数组
        int m=5;
        int n=5;
        int[][] arr=new int[m][n];
        int[][] arr1=new int[m][];//m个一维数组，每一个默认初始值是null

        arr1[0]=new int[3];
        arr1[1]=new int[1];
        arr1[2]=new int[2];

        //int[][] arr3=new int[][n];//error

        //-------------------------------------------------
        //多维数组的初始化
        int[][] arr3=new int[][]{{1,2,3},{2,7},{4,5,6,7}};
        int[][] arr4=new int[3][];
        //arr4[0]={3,8,2}报错了，暂时不知道什么原因(但是ppt写着可以)
        arr4[0]=new int[]{3,8,2};
        arr4[1]= new int[]{2, 7};
        arr4[2]= new int[]{9, 0, 1, 6};

        //------------------------------------------------
        //特殊写法
        int[] x,y[];//x是一维数组，y是二维数组

        //------------------------------------------------
        //对象数组,这里的Person借了课上的Person代码
        Person[] students;
        Person students1[];//两种定义都是正确的

        //------------------------------------------------
        //对象数组初始化
        students=new Person[]{
                new Person("张三",21),
                new Person("李四",19)
        };

        //------------------------------------------------
        //数组使用错误示范
        //1:
        //int[] score=new int[];//无数组大小

        //2:
        int[] score=new int[3];
        //score[3]=3;//越界

        //3:
        int[] score1=new int[5];
        //score1={60,80,90,70,85};//定义和初始化应该放在同一个地方
    }
}
