public class secLarg {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int nums=arr[i];
            if(nums>first){
                second=first;
                first=nums;
            }
            else if(nums>second && nums<first){
                second=nums;
            }
        }
        System.out.println(second);
    }
}
