public class singleLineSwap {
    public static void main(String[] args) {
        int a=5,b=10;
        a=(a+b)-(b=a);//BEST METHOD FOR SWAPPING
        System.out.println("A="+a+",B="+b);
    }
}
