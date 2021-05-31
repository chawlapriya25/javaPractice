package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class practice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[5];
        int[] sort = new int[0];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter an integer?");
            arrays[i] = sc.nextInt();
        }
        Arrays.sort(arrays);

        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.println(arrays[i] + " ");
        }

    }
}

