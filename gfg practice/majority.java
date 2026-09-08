public class majority {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,1,3,4};
    int n = arr.length;
        int candidate = -1;
        int votes = 0;

        // Step 1: Find a candidate for the majority element
        for (int i = 0; i < n; i++) {
            if (votes == 0) {
                candidate = arr[i];
                votes = 1;
            } else {
                if (arr[i] == candidate) {
                    votes++;
                } else {
                    votes--;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        // According to GFG constraints, it must appear STRICTLY more than n/2 times
        if (count > n / 2) {
            System.out.println(candidate);
        }
    }
}
