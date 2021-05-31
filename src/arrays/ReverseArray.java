package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
   public static Scanner sc = new Scanner(System.in);
    public static void reverse(int[] array) {
       int i;
        int j;
        int l = array.length;
        for (i = 0; i <= l/2; i++) {
            int temp = array[i];
            array[i] = array[l - 1 - i];
            array[l - 1 - i] = temp;

// by making the loop reverse
//            for (j = l - 1; j >= 0; j--) {
//                System.out.println(" ");
//                System.out.print(+array[j] + " ");
        }
    }

    public static void main(String[] args) {
      int[] array={1,3,2,4,5,6,6};
        System.out.println("Array="+ Arrays.toString(array));

        reverse(array);

        System.out.println(" reverse Array="+ Arrays.toString(array));
    }
}
