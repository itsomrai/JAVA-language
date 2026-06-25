import java.util.*;
public class switchDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // monday=1;tuesday=2
        System.out.println("Enter the day");
        int day = sc.nextInt();
        switch(day){
            case 1: 
            System.out.println("Monday");
            break;
            case 2: 
            System.out.println("Tuesday");
            break;
            case 3: 
            System.out.println("Wednesday");
            break;
            case 4: 
            System.out.println("Wednesday");
            break;
            case 5: 
            System.out.println("Friday");
            break;
            case 6: 
            System.out.println("Saturday");
            break;
            case 7: 
            System.out.println("Sunday");
            break; 
        }
        sc.close();
    }
}
