package example;

public class BlackBox {
    public boolean timeLimit(int time){
        int mouth=time%100;
        return mouth<13 && mouth>=1 && time>=199001 && time<=202112;
    }

    public int Add(int x1,int x2){
        return (1<=x1 && x1<=100 && 50<=x2 && x2<=200)?   (x1+x2)  :  -1;
    }
}
