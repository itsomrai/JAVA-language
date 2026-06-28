import java.util.*;
public class primeOrNot {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
                    if(count==0){
                System.out.println("This is a prime number");
            }
            else{
                System.out.println("Not prime number");
            }
        sc.close();
        }
    }

