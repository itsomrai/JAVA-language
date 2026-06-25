import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("java Console Calculator");

        System.out.println("Enter The First Number");
        double a=s.nextDouble();
        System.out.println("Enter The Second Number");
        double b=s.nextDouble();
        System.out.println("Enter the opretor(+,-,/,%,*)");
        char ch=s.next().charAt(0);

        double result;

        switch (ch) {
            case '+':
                result=a+b;
                break;
        
            case '-':
                result=a-b;
                break;
        
            case '*':
                result=a*b;
                break;
        
            case '/':
                result=a/b;
                break;

            case '%':
                result=a%b;
                break;

                default:
                    System.out.println("Error: Undefined");
                    s.close();
                    return;
        }
        System.out.println("Result:"+a +ch +b+"=" +result);
        s.close();
    }
}

