public class maxSubarray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int res=nums[0];
        int total=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            int n=nums[i];
            if(total<0){
                total=0;
            }
            total=total+n;
            res=Math.max(res,total);
        }
        System.out.println(res);

        }
    }
 
