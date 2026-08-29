public class constantWindow {
    public static void main(String[] args) {
        int[] arr={-1,2,5,4,5,-1};
        int k=4;
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