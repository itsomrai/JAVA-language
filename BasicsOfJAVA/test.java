import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //pen =10; notebook=40;
        int cash=sc.nextInt();

        if(cash<10){
            System.out.println("Cannot buy Anything");
            System.out.println("Get more cash");
        }
        else if(cash>=10 && cash<40){
            System.out.println("Can only buy pen");
            System.out.println("Get more cash for the NOtebook");
        }
        else{
            System.out.println("Can buy pen or Notebook");
        }
    sc.close();
}
}
