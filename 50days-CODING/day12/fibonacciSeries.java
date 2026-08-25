import java .util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        sc.close();
        if(n<=1){
            System.out.println(n);
        }
        int a=0;int b=1;
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println(b);
    }
}
