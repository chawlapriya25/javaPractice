package rank;
import java.math.BigInteger;
import java.util.*;

public class add {



        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        BigInteger c= sc.nextBigInteger();
        BigInteger d= sc.nextBigInteger();
       BigInteger sum;
       sum=c.add(d);
       BigInteger sum2;
       sum2=c.multiply(d);
            System.out.println(sum);
            System.out.println(sum2);
     }
}

