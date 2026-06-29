
public class printArmstrong {
    public static void main(String[] args) {
        int arm;
        int i=1;
        System.out.println("ARMSTRONG NUMBERS BETWEEN 1-1000");
        while(i<=1000){
            arm=armstrong(i);
            if(arm==i)
                System.out.println(i);
                i++;
        }
    }
            static int armstrong(int num){
        int x,a=0;
        while (num!=0) {
            x=num%10;
            a=a+(x*x*x);
            num/=10;
        }
        return a;
    }

}
