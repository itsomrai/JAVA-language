public class maxSubArrayBetterSol {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=10;
        int l=0;int r=0;int sum=0;int maxLength=0;
        while(r<arr.length){
            sum=sum+arr[r];
            while(sum>k){
                sum=sum-arr[l];
                l=l+1;
            }
            if(sum<=k){
                maxLength=Math.max(maxLength, r-l+1);
                r=r+1;
            }
        }
        System.out.println(maxLength);
    }
}
