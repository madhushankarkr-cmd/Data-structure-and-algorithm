// product of array

import java.util.Scanner;

class Prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int[] arr ={2,3,4,5,6,7};
        int pro = 1;
        
        for (int i = 0; i < arr.length; i++) {
       
            pro = pro*arr[i];
        
        }

        
        
            System.out.print(pro);
        

    }
}