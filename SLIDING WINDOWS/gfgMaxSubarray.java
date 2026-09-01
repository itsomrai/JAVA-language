public class gfgMaxSubarray {
    public static void main(String[] args) {
        int[] arr={100, 200, 300, 400};
        int k=2;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int maxSum=sum;
        int l=0;int r=k-1;
        while(r<arr.length-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxSum=Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
