package excercise;

import java.util.Scanner;

public class threeIntegear {
  int multiply(int a,int b,int c){  //method with parameter
      int sum;
      sum=a*b*c;
      System.out.println(sum);
      return sum;
  }
  public static void main(String[] args) {
      threeIntegear three =new threeIntegear();
      Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        three.multiply(a,b,c);

    }
}
