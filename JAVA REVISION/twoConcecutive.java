public class twoConcecutive {
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1,1,0};
        int count=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            if(n==0){
                count=0;
            }
            else{
                count++;
            }
            if(res<count){
                res=count;
            }
        }
        System.out.println(res);
        }
    }

