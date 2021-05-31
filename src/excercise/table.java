package excercise;

public class table {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        int sum3=0;
        System.out.print("N  10*N  100*N  1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            sum = i * 10;
            sum2=i*100;
            sum3=i*1000;
            System.out.printf("%d\t%d\t%d\t%d\t", i, sum,sum2,
                    sum3);
        }
    }
}

