public class maxSubarrayBrute {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=10;
        int maxLength=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                sum=sum+arr[j];
                if(sum<=k){
                    maxLength=Math.max(maxLength, j-i+1);
                }
                else if(sum>k){
                    break;
                }
            }
            
        }
        System.out.println(maxLength);
    }
}
