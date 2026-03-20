// second largest number
import java.util.Scanner;

public class Prob9 {
    // Finds the maximum element in an array
    static int findmax(int[] arr) {
        int mx = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Finds the second maximum by replacing the first max with MIN_VALUE
    static int findsmax(int[] arr) {
        int mx = findmax(arr);
        int n = arr.length;
        
        // Replace all occurrences of max with MIN_VALUE
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        // Find the new max (which is the original second max)
        int smx = findmax(arr);
        return smx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("Array size must be at least 2");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output results
        System.out.println("Maximum: " + findmax(arr.clone())); // Using clone to keep original array
        System.out.println("Second Maximum: " + findsmax(arr));
        
        sc.close();
    }
}
