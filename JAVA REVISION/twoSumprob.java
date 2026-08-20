/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]*/

import java.util.Arrays;

public class twoSumprob {
    public static int[] twoSum(int[] arr,int target){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i] + arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int[] result=twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
