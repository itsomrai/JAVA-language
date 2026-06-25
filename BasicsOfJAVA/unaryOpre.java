public class unaryOpre {
    public static void main(String[] args) {
        int a=1;
        a++;//unary opretor[post increment]
        System.out.println(a);
        int num=1;
        System.out.println(num++);//1 Because first change the value then increment
        System.out.println(num);//2
        System.out.println(++num);//2 First increment the value[pre increment]
    }
}
