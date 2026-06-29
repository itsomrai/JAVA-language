import java .util.*;
public class specialCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int c_pos=0; int c_neg=0; int c_zero=0;
        char choice;
        do{
            System.out.println("ENTER THE NUMBER");
            int number=sc.nextInt();

            if(number>0){
                c_pos++;
            }
            else if(number<0){
                c_neg++;
            }
            else{
                c_zero++;
            }

            System.out.print("DO YOU WANT TO CONTINUE?");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
        System.out.println("POSTIVE NUMBERS: "+c_pos);
        System.out.println("NEGETIVE NUMBERS: "+c_neg);
        System.out.println("ZERO NUMBERS: "+c_zero);
        sc.close(); 
    }
}
