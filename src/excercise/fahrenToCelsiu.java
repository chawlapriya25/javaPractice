package excercise;

import java.util.Scanner;

public class fahrenToCelsiu {
   double formula(double fre){
       double celsius=fre-32.0;
       double cel=(5.0/9.0);
       double cel1=Math.round(celsius*cel);
       System.out.println(cel1);
       return cel1;
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        fahrenToCelsiu fahren= new fahrenToCelsiu();
        double fre=  sc.nextDouble();
        fahren.formula(fre);
    }
    }