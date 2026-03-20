import java.util.Scanner;

public class Prob4 {
    static int countarray(int[] arr,int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr array size");
    int n= sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter array element");
    for(int i =0;i<n;i++)
        arr[i]=sc.nextInt();

    System.out.println("Enter the value of x ");
    int x = sc.nextInt();

    System.out.println(countarray(arr, x));

    }
}
