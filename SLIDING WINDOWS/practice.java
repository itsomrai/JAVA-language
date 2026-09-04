public class practice {
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=2;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            maxSum=Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
