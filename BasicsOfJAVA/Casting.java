public class Casting {
    public static void main(String[] args) {
        //IMPLICIT TYPE CASTING
        double price=100.18;
        double finalPrice=price+18;
        System.out.println(finalPrice);

        //EXPLICIT TYPE CASTING
        int p=100;
        int fp=p+(int)18.34;/*if we not add int in parenthesis it will show error because int is small taking memory 
        and double takes more memory so we cannot cast double into integer type*/
        System.out.println(fp); 
    }
}
