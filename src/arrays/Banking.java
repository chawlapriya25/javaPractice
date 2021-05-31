package arrays;

import java.util.ArrayList;

public class Banking {
    class doubleCustomer{
        private double value;

        public void setValue(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public doubleCustomer(double value) {
            this.value = value;
        }
        ArrayList<doubleCustomer>Customer=new ArrayList<doubleCustomer>();
    }
    public static void main(String[] args) {
        ArrayList<String>branches= new ArrayList<String>();
        branches.add("Toronto");
        branches.add("Calgary");
        branches.add("Vancouver");


    }
}