package rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currency {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Locale indiaLocale = new Locale("en", "IN");
            double payment = scanner.nextDouble();
            scanner.close();


            NumberFormat us  = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);



                    System.out.println("US: " +us.format(payment));
            System.out.println("India: " + india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }

