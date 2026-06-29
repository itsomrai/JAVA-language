import java.util.*;
public class calculateHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int divident=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int divisor=sc.nextInt();
        int rem;int hcf=0;
        do{
            rem=divident%divisor;

            if(rem==0){
                hcf=divisor;
            }
            else{
                divident=divisor;
                divisor=rem;
            }

        }while(rem!=0);
        System.out.println("HCF= "+hcf);
        sc.close();
    }
}
