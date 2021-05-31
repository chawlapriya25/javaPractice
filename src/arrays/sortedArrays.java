package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortedArrays {
   public static  Scanner sc = new Scanner(System.in);

    public static int[] getInteger(int number){
        int[] arrays= new int[number];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter an integer?");
            arrays[i] = sc.nextInt();
        }
        return arrays;
    }
    public static int[] sortInteger(int[] myInt) {
        Arrays.sort(myInt);
        return myInt;
    }
    public static int[] printArray(int[] myInt) {
        for (int i = myInt.length - 1; i >= 0; i--) {
            System.out.println( "My sorted array in descending order " +myInt[i] + " ");
        }
        return myInt;
    }

    public static void main(String[] args) {
        int[] myInt=getInteger(5);
        sortInteger(myInt);
        printArray(myInt);


    }
}



