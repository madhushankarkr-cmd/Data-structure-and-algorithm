// first same value 

import java.util.Scanner;

public class prob10 {
    static int Firstunique(int[] arr){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]) {
                return arr[i];
            }
        }
        }
        return -1;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enetr array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Firstunique(arr));
    }
}
