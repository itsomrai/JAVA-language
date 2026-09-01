import java.util.Arrays;

public class firstNeg {
    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        int k=4;
        int n=arr.length;
        // Total number of windows will be (n - k + 1)
        long[] result = new long[n - k + 1];
        int resultIndex = 0;
        
        // This pointer tracks the position of the first negative number
        int firstNegativeIndex = 0;

        // Loop through each window starting position 'i'
        for (int i = 0; i <= n - k; i++) {
            
            // If our negative tracker lags behind the current window start, update it
            if (firstNegativeIndex < i) {
                firstNegativeIndex = i;
            }

            // Move the tracker forward until it finds a negative number 
            // or until it reaches the end of the current window
            while (firstNegativeIndex < i + k && arr[firstNegativeIndex] >= 0) {
                firstNegativeIndex++;
            }

            // If the tracker is still within the window, we found our negative number!
            if (firstNegativeIndex < i + k) {
                result[resultIndex++] = arr[firstNegativeIndex];
            } else {
                result[resultIndex++] = 0; // No negative number in this window
            }
        }

        System.out.println(Arrays.toString(result));
    }
}

