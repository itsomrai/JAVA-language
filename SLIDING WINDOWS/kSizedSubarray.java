import java.util.ArrayList;

public class kSizedSubarray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 1, 4, 5, 2, 3,6};
        int k=3;
                ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int maxElement=arr[i];
            
            for(int j=1;j<k;j++){
                if(arr[i+j] > maxElement){
                    maxElement=arr[i+j];
                }
            }
            res.add(maxElement);
        }
        System.out.println(res);
    }
}
