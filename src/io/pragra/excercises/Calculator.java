package io.pragra.excercises;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {
        int sum = num1 + num2;
        return sum;
    }

    public int substraction() {
        int sum2 = num1 - num2;

        return sum2;
    }
}
class AdvanceCalculator extends Calculator {
        private int num1;
        private int num2;
        public AdvanceCalculator(int num1, int num2) {
            super(num1, num2);
            this.num1=num1;
            this.num2=num2;
        }

        public int multiplication() {
            System.out.println(super.addition());
            int sum3 = num1 * num2;
            System.out.println(sum3);
            return sum3;
        }

        public int divisions() {
            System.out.println(super.substraction());
            int sum4 = num1 / num2;
            System.out.println(sum4);
            return sum4;
        }

    public static void  main(String[] args) {
        //Calculator calu= new Calculator(2,4);

         AdvanceCalculator adv= new AdvanceCalculator(2,4);

         adv.addition();
         adv.multiplication();
         adv.substraction();
         adv.divisions();


    }
}