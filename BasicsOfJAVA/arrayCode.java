import java.util.Arrays;
public class arrayCode {
    public static void main(String[] args) {
        int[] marks={87,98,99,43,97};
        Arrays.sort(marks);
        //NOW ORDER BECOMES:{43,87,97,98,99};
        System.out.println(marks[0]);
    }
}
