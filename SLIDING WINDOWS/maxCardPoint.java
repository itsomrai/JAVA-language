public class maxCardPoint {
    public static void main(String[] args) {
        int[] cardPoints={7,8,6,3,4,5,2};
        int k=4;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
        }
        int maxSum=sum;
        int l=0;int r=k-1;
        while(r<cardPoints.length-1){
            sum=sum-cardPoints[l];
            l++;
            r++;
            sum=sum+cardPoints[r];
            maxSum=Math.max(maxSum, sum);
        }
        System.out.println(maxSum);  
}
    }

