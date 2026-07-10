import java.util.Arrays;
public class checkArraySorted {
    public static void main(String[] args) {
        int[] arr1={1,3,2,4,6,5};
        int[] arr2={2,3,5,1,4,6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("not equals");
        }
    }
}
