import java.util.*;
public class doWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number;
        do{
            System.out.println("Take input from user");
            number=sc.nextInt();
            System.out.print("Here is your number:");
            System.out.println(number);
        }while(number>=0);
        System.out.println("THE END");
        sc.close();
    }
}
