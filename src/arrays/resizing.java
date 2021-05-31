package arrays;

import java.util.Scanner;

public class resizing {
    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[10]=89;
        baseData[11]=67;
       // System.out.println("Enter 12 integers:");
        //getInput();
        printArray(baseData);

    }
}
//resizing the array
//saving the original  array in dulicate one and for the duplicate one initlaize the new array
// or we can assign the numbers to the index.