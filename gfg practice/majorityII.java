import java.util.Scanner;

public class majorityII {
    public static void main(String[] args) {
    int n;
    int a[];
        System.out.println("ENTER THE SIZE OF ARRAY");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt(); 
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[j]==a[i]){
                    count++;
                }
            }
                if(count>n/2){
                     System.out.println("The majority element is "+a[i]);
                     found=true;
                     break;
                }
            }
                if(!found){
                    System.out.println("No majority Element found");
                }
                sc.close();
        }
    }
