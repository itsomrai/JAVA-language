public class climbStairs {
    public static void main(String[] args) {
        int n=6;
        if(n<3){
        System.out.println(n);
        }
        int prev=3;
        int prev2=2;
        int current=0;
        for(int i=3;i<n;i++){
            current=prev+prev2;
            prev2=prev;
            prev=current;
        }
        System.out.println(current);
    }
}
