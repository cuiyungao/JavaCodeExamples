package example;

import java.io.*;

public class WhiteBox {
    public int Funcl(int a,int b,int x){
        if((a>1) && (b==0)){
            x=x/a;
            System.out.println("p2");
        }else{
            System.out.println("p1");
        }
        if((a==2)||(x>1)){
            x=x+1;
            System.out.println("p4");
        }else{
            System.out.println("p3");
        }
        return x;
    }
}
