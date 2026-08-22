public class concecutiveElements {
    public static void main(String[] args) {
        int[] nums={-1,2,3,3,5,4};
        int n= nums.length;
        int sum=0;
        int l=0;
        int r=0;
        int k=1;
        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            int maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
