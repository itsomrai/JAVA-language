/*Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores). */

public class removeElement {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int val=3;
        int index=0;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=val){
            arr[index]=arr[i];
            index++;
        }
        }
    System.out.println(index);
}
}
