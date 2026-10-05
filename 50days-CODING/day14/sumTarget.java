import java.util.Arrays;

public class sumTarget {

    public static void main(String[] args) {
        int ele[]={1,2,2,3,4,5,6};
        int s=ele.length;
        int target=7;
        for(int i=0;i<s-1;i++){
            for(int j=i+1;j<s;j++){

            if(ele[i]+ele[j]==target){
                System.out.println(Arrays.toString(new int[]{i,j}));
                break;
            }
        }
        }
    }
}