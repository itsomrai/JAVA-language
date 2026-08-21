import java.util.ArrayList;
import java.util.List;

public class disapperedArray {
    public static void main(String[] args) {
        int[] nums={2,3,5,7,9};
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        
        
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            seen[num] = true;
        }
        
        
        List<Integer> result = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            if (!seen[num]) {
                result.add(num);
            }
        }
        
        System.out.println(result);
    }

    }

