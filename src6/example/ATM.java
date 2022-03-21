package example;

import java.util.Scanner;

public class ATM {
    private int amount;
    private String carID;
    private String password;
    private int customerMoney;
    private boolean aliveCard=true;
    private Scanner input = new Scanner(System.in);


    public ATM(int amount, String carID, String password, int customerMoney) {
        this.amount = amount;
        this.carID = carID;
        this.password = password;
        this.customerMoney = customerMoney;
    }

    public void PrintMain(){
        System.out.println("---------------------------------");
        System.out.println("           WELCOME               ");
        System.out.println("---------------------------------");
    }

    private String CMD(String str){
        System.out.print(str);
        return input.nextLine();
    }

    public void work(){
        while(true){
            PrintMain();
            String testCarID=CMD("here is an ATM,please input your CarID:");
            if(!testCarID.equals(carID)){
                System.out.println("sorry your cardId is wrong");
                System.out.println(carID);
                continue;
            }
            int i=0;
            for(i=0;i<3;i++){
                String testPassword=CMD("please input your password:");
                if(testPassword.equals(password)){
                    String use=CMD("save money(1) or load money(0)?");
                    int money;
                    if(use.equals("0")){
                        try{
                            money=Integer.parseInt(CMD("How much money?"));
                        }catch (Exception e){
                            System.out.println("sorry your \"money\" is not money");
                            continue;
                        }
                        if(money>customerMoney){
                            System.out.println("sorry ATM has no so much money");
                            continue;
                        }
                        customerMoney-=money;
                        amount-=money;
                        System.out.println("now you have "+customerMoney+"￥");
                        System.out.println("now ATM have "+amount+"￥");
                    }else if(use.equals("1")){
                        try{
                            money=Integer.parseInt(CMD("How much money?"));
                        }catch (Exception e){
                            System.out.println("sorry your \"money\" is not money");
                            continue;
                        }
                        customerMoney+=money;
                        amount+=money;
                        System.out.println("now you have "+customerMoney+"￥");
                        System.out.println("now ATM have "+amount+"￥");
                    }else{
                        System.out.println("sorry no this usage");
                        break;
                    }
                    break;
                }
            }
            if(i==3){
                System.out.println("sorry You have entered the wrong password three times,now we can't service for you.");
                this.aliveCard=false;
                System.exit(0);
            }
        }
    }

    //注，这里的work是死循环如果不是连续输错三次密码是不会结束程序的
    public static void main(String[] args) {
//        ATM atm=new ATM(5000,"1234567812345678","12345",2000);
//        atm.work();
//        ATM atm=new ATM(4000,"1234567812345678","12345",2000);
//        atm.work();
        ATM atm=new ATM(4000,"1234567812345678","12345",1000);
        atm.work();
    }
    //运行结果
    //---------------------------------
    //           WELCOME
    //---------------------------------
    //here is an ATM,please input your CarID:1234567812345678
    //please input your password:12345
    //save money(1) or load money(0)?0
    //How much money?1000
    //now you have 1000￥
    //now ATM have 4000￥

    //---------------------------------
    //           WELCOME
    //---------------------------------
    //here is an ATM,please input your CarID:123
    //sorry your cardId is wrong
    //1234567812345678

    //---------------------------------
    //           WELCOME
    //---------------------------------
    //here is an ATM,please input your CarID:1234567812345678
    //please input your password:654321
    //please input your password:987654
    //please input your password:876543
    //sorry You have entered the wrong password three times,now we can't service for you.
}