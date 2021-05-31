package excercise;

import java.util.Scanner;

public class upperlower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String upper=s.toUpperCase();
        String lower=s.toLowerCase();
        System.out.printf("%s%s",upper, lower);


    }
}
