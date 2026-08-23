public class maxSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int k=4;
        int l=0;int r=k-1;
        int n=nums.length;
        int sum=0;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            int maxSum=Math.max( sum);
        System.out.println(maxSum);
    }
}
}
