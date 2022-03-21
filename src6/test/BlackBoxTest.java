package test;

import example.ATM;
import example.BlackBox;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackBoxTest {
    static BlackBox blackbox;
    @BeforeAll
    static void begin(){
        blackbox=new BlackBox();
    }

    //等价类划分例子
    @Test
    public void testTimeLimit1(){
//        assertEquals(true,blackbox.timeLimit(aaa123));//无效输入
        assertEquals(false,blackbox.timeLimit(2011));//有效的输入
        assertEquals(false,blackbox.timeLimit(20140408));//无效输入
        assertEquals(false,blackbox.timeLimit(187905));//无效输入
        assertEquals(false,blackbox.timeLimit(209811));//无效输入
        assertEquals(false,blackbox.timeLimit(200100));//无效输入
        assertEquals(false,blackbox.timeLimit(200156));//无效输入
        assertEquals(true,blackbox.timeLimit(201408));//有效输入
    }

    //边界值分析
    @Test
    public void testAdd(){
        //穷尽测试
        ranctangleTest(0,201,101,201,0,49);
    }

    @Test
    public void testAdd2(){
        //穷尽有限域测试
        ranctangleTest(1,200,100,200,1,50);
    }

    @Test
    public void testAdd3(){
        //多边界测试
        ranctangleTest(0,201,2,201,0,199);
        ranctangleTest(99,201,101,201,99,199);
        ranctangleTest(0,51,2,51,0,49);
        ranctangleTest(99,51,101,51,99,49);
    }

    @Test
    public void testAdd4(){
        //单边界测试
        ranctangleTest(0,199,2,199,0,51);
        ranctangleTest(2,201,99,201,2,199);
        ranctangleTest(99,199,101,199,99,51);
        ranctangleTest(2,51,99,51,2,49);
    }

    @Test
    public void testAdd5(){
        //简单测试方法
        //上
        assertEquals(-1,blackbox.Add(55,201));
        assertEquals((55+200),blackbox.Add(55,200));
        assertEquals((55+199),blackbox.Add(55,199));

        //右
        assertEquals((99+150),blackbox.Add(99,150));
        assertEquals((100+150),blackbox.Add(100,150));
        assertEquals(-1,blackbox.Add(101,150));

        //下
        assertEquals((55+51),blackbox.Add(55,51));
        assertEquals((55+50),blackbox.Add(55,50));
        assertEquals(-1,blackbox.Add(55,49));

        //左
        assertEquals((2+150),blackbox.Add(2,150));
        assertEquals((1+150),blackbox.Add(1,150));
        assertEquals(-1,blackbox.Add(0,150));
    }

    private void ranctangleTest(int x1,int y1,int x2,int y2,int x3,int y3){
        //这里如果有一个函数接口,就可以测试多种函数,为了简单起见，要求上面传入的参数是一个长方形的左上，右上，左下顶点坐标
        //实在算不出ppt给的边界，所以所有的边界宽度都取了1
        for(int i=x1;i<x2;i++){
            for(int j=y1;j<y3;j++){
                if((i<1 || i>100) && (j<50 || j>150)){
                    assertEquals(-1,blackbox.Add(i,j));
                }else{
                    assertEquals((i+j),blackbox.Add(i,j));
                }
                if(j>y1-1){
                    j+=96;
                }
            }
        }
    }

    //这里的Test也许是因为System.in没有办法被调用到，所以把测试放在ATM的main方法里面了
//    @Test
//    public void TestATM(){
//        ATM atm=new ATM(4000,"12345","123",2000);
//        atm.work();
//    }
}