import java .util.*;
public class conditionGreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a=sc.nextInt();
        System.out.println("Enter B");
        int b=sc.nextInt();
        System.out.println("Enter C");
        int c=sc.nextInt();
        System.out.println("Enter D");
        int d=sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println("A ="+a+"A IS GREATER");
        }
        else if(b>a&& b>c && b>d){
            System.out.println("B ="+b+"B IS GREATER");
        }
        else if(c>a&& c>b && c>d){
            System.out.println("C = "+c+" C IS GREATER");
        }
        else if(d>a&& d>b && d>c){
            System.out.println("D = "+d+" D IS GREATER");
        }
sc.close();
    }
}
