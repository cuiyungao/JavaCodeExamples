package test;

import example.WhiteBox;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhiteBoxTest {
    //4个基本逻辑判断条件
    //T1:a>1
    //T2:b==0
    //T3:a==2
    //T4:x>1

    //4条执行路径
    //L13:p1->p3
    //L14:p1->p4
    //L23:p2->p3
    //L24:p2->p4

    private static WhiteBox whiteBox;

    @BeforeAll
    public static void gululu(){
        whiteBox=new WhiteBox();
    }
    //语句覆盖率=(至少被执行一次的语句数量)/(可执行的语句数量)


    //语句覆盖
    //至少执行程序中所有语句一次。
    @Test
    public void test1(){
        assertEquals(3,whiteBox.Funcl(2,0,4));//覆盖路径:L24(只是完成一次程序执行)
    }

    //判定测试
    //也称为分支覆盖，至少执行程序中每个分支一次，保证程序中每个判定节点取得每
    //种可能的结果至少一次。
    @Test
    public void test2(){
        assertEquals(3,whiteBox.Funcl(1,1,2));//覆盖路径:L14
        assertEquals(1,whiteBox.Funcl(3,0,3));//覆盖路径:L23
    }

    //条件覆盖
    //不仅每个语句至少执行一次，而且使判定表达式中的每个基本逻辑判定条件都
    //取到各种可能的结果（真、假）
    @Test
    public void test3(){
        assertEquals(1,whiteBox.Funcl(2,1,0));//覆盖条件:T1=true;T2=false;T3=true;T4=false;
        assertEquals(3,whiteBox.Funcl(1,0,2));//覆盖条件:T1=false;T2=true;T3=false;T4=true;
    }

    //判定条件覆盖
    //同时满足判定覆盖和条件覆盖。
    @Test
    public void test4(){
        assertEquals(3,whiteBox.Funcl(2,0,4));//覆盖条件:T1=true;T2=true;T3=true;T4=true;覆盖路径:L24
        assertEquals(1,whiteBox.Funcl(1,1,1));//覆盖条件:T1=false;T2=false;T3=false;T4=false;覆盖路径:L13
    }

    //条件组合覆盖
    //每一个if语句含两条条件式，共16种不同条件组合情况
    //保证程序每个判定节点中，所有简单判定条件的所有可能的取值组合情况至少
    //执行一次。
    @Test
    public void test6(){
        assertEquals(3,whiteBox.Funcl(2,0,4));//使用T1,T2,T3,T4是否为真的顺序来注释(1为真0为假):1111
        assertEquals(2,whiteBox.Funcl(2,0,2));//1110
        assertEquals(3,whiteBox.Funcl(3,0,6));//1101
        assertEquals(1,whiteBox.Funcl(3,0,3));//1100
        assertEquals(3,whiteBox.Funcl(2,1,2));//1011
        assertEquals(2,whiteBox.Funcl(2,1,1));//1010
        assertEquals(3,whiteBox.Funcl(3,1,2));//1001
        assertEquals(3,whiteBox.Funcl(3,1,2));//1000
        assertEquals(3,whiteBox.Funcl(1,0,2));//0101
        assertEquals(1,whiteBox.Funcl(1,0,1));//0100
        assertEquals(3,whiteBox.Funcl(1,1,2));//0001
        assertEquals(1,whiteBox.Funcl(1,1,1));//0000
    }

    //路径覆盖
    //使程序中每一条可能的路径至少执行一次。
    @Test
    public void test7(){
        assertEquals(3,whiteBox.Funcl(2,0,4));//L24
        assertEquals(1,whiteBox.Funcl(1,1,1));//L13
        assertEquals(3,whiteBox.Funcl(1,1,2));//L14
        assertEquals(1,whiteBox.Funcl(3,0,3));//L23
    }
}
