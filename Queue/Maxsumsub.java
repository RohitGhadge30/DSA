import java.util.ArrayDeque;
import java.util.Deque;

class Maxsumsub {
    public static void printMaxOfSubarrays(int arr[], int N, int K) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Process the first K elements separately
        for (int i = 0; i < K; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.add(i);
        }

        // Process the remaining elements
        for (int i = K; i < N; i++) {
            System.out.print(arr[dq.peekFirst()] + " ");

            // Remove elements outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i- K) {
                dq.removeFirst();
            }

            // Remove smaller elements from the rear
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            // Add the current element to the deque
            dq.addLast(i);
        }

        // Print the maximum element of the last subarray
        System.out.print(arr[dq.peekFirst()]);
    }

    public static void main(String[] args) {
        int N = 9;
        int K = 3;
       int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
     // int[] arr = {8 ,5, 10 ,7, 9, 4 ,15 ,12, 90, 13};

        printMaxOfSubarrays(arr, N, K);
    }
}
