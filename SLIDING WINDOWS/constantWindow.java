public class constantWindow {
    public static int consWindow(int[] arr,int k){
        int currentSum = 0;

        // Step 1: Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        // Step 2: Slide the window from index 'k' to the end of the array
        for (int i = k; i < arr.length; i++) {
            // Add the incoming element and subtract the outgoing element
            currentSum += arr[i] - arr[i - k]; 
            
            // Track the maximum value seen so far
            maxSum = Math.max(maxSum, currentSum); 
        }

        return maxSum;
    }    
        public static void main(String[] args) {
        int[] arr = {2, -5, 6, 1, -2, 4, 3};
        int k = 4;
        // Expected max window is [6, 1, -2] -> Sum = 5, or [1, -2, 4] -> Sum = 3, or [4, 3, -2]... 
        // Wait, [6, 1, -2] is 5. [6, 1, 1]... let's check max: 6+1-2 = 5. Let's look at 4+3-2 = 5. 
        // Max consecutive 3 elements here: {6, 1, -2} is 5. {-2, 4, 3} is 5.
        System.out.println("Maximum sum of a window of size " + k + " is: " + consWindow(arr, k));
    }
}
