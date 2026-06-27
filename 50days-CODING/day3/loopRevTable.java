import java.util.*;
public class loopRevTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which you have to print");
        int s=sc.nextInt();
        int prod=1;
        for(int i=10;i>=1;i--){
            prod= s*i;
            System.out.println(s+"X"+i+"="+prod);
        }
        sc.close();
    }
}
