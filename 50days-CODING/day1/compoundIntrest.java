import java.util.*;
public class compoundIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        double principle=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        System.out.println("Enter Rate");
        double ratePer=sc.nextDouble();

        double amt;
        double ci;

        amt=principle*Math.pow(1+ratePer/100,time);
        ci=amt-principle;

        System.out.println("Total Amount is:"+amt);
        System.out.println("Compound Interest:"+ci);
        sc.close();
    }
}
