package arrays;

import java.util.Scanner;

public class MinimumElement {
    public static Scanner sc = new Scanner(System.in);

    public static int[] readInteger(int count) {
        System.out.printf("Enter the integer?");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("the total number entered is " + count);
        return array;
    }

    public static int findMin(int[] myInteger) {
        int min = myInteger[0];
        for (int i = 1; i <myInteger.length; i++) {
            if (myInteger[i] < min) {
                min = myInteger[i];
            }
        }
        return min;
    }
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count= sc.nextInt();
        int[] myInteger= readInteger(count);
       int  min=findMin(myInteger);
        System.out.println("the min value in the arrays is "+min);
    }
    }
