
//triple pairs and sum of x
import java.util.Scanner;

public class Prob7 {

    static int countarray(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for(int k=0;k<arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == x) {
                    System.out.println(arr[i] + "," + arr[j] + "," +arr[k]);
                    count++;
                }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value of x ");
        int x = sc.nextInt();

        System.out.println(countarray(arr, x));

    }

}
