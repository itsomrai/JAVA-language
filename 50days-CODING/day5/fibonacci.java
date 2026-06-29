import java .util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
        int num=sc.nextInt();
        int a=0;int b=1,c=0,i;
        for(i=1;i<=num;i++){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
        sc.close();
    }
}
