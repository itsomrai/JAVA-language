import java.util.Scanner;
public class inputUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your Age :");
        int age=sc.nextInt();
        sc.nextLine();//Add this line clear the leftover Enter key from the buffer
        System.out.println("Input the name");
        String name=sc.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        sc.close();//Close the scanner when it is done
    }
}