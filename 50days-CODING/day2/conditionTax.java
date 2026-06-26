import java.util.*;
public class conditionTax {
    public static void main(String[] args) {
        double tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE INCOME");
        double inc=sc.nextDouble();
        if(inc<=1200000){
        tax=0;
        }
        else if(inc>1200000 && inc<1800000){
            tax=0.05*(inc-1200000);
        }
        else if(inc>1800000 && inc<2500000){
            tax=0.05*(1800000-1200000)+ 0.02*(inc-1800000);
        }
        else{
            tax=0.05*(1800000-1200000) + 0.02*(2500000-1800000)+ 0.03*(inc-2500000);
        }
            System.out.println("Total tax he had to pay is="+ tax);  
            sc.close();
    }
}