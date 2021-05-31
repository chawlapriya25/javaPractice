package excercise;

import java.util.Scanner;

public class excercise15 {
    int number;
    int sum = 0;
    double average = 0;
    int count=0;
    double avg() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter an integer? : ");
            number = sc.nextInt();
            sum+= number;
            count++;
            if (number == -1) {
                break;
            }
        }
        System.out.println("count is "+count);

        System.out.println(+sum);
            float average = (float)sum / array.length;
            System.out.printf("%.2f",average);

        return average;
    }
    public static void main(String[] args) {
        excercise15 avrge = new excercise15();
       avrge.avg();
    }
}
