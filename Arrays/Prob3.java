// find max and min
import java.util.Arrays;
public class Prob3 {
    public static void main(String[] args) {
        
    
    int[] arr = {97, 53, 47, 58, 66, 7};

/*int max = arr[0];
int min = arr[0];

for (int i = 1; i < arr.length; i++) {
    max = Integer.max(max, arr[i]);
    min = Integer.min(min, arr[i]);
}

System.out.println("Max: " + max);
System.out.println("Min: " + min);
*/
Arrays.sort(arr);

System.out.println(arr[0]);
System.out.println(arr[5]);



}
}


