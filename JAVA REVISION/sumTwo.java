import java.util.Arrays;

public class sumTwo{
        public static int[] twoSum(int[] arr, int target) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6};
            int target=4;
            int[] result=twoSum(arr,target);
            System.out.println(Arrays.toString(result));
        }
}
