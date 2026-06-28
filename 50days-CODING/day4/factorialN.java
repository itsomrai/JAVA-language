import java.util.*;
public class factorialN {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHICH YOU HAVE TO FIND ITS FACTORIAL");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("THE FACTORIAL OF "+n+"="+fact);
        sc.close();
    }
}
