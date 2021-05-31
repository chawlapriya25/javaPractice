package arrays;

import java.util.ArrayList;


        class Intclass{
        private int myValue;

        public int getMyValue() {
            return myValue;
        }

            public void setMyValue(int myValue) {
                this.myValue = myValue;
            }

            public Intclass(int myValue)
        {
            this.myValue=myValue;
        }
    }
public class Mobilephones {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("priya");

        ArrayList<Intclass> array2 = new ArrayList<Intclass>();
        array2.add(new Intclass(90));


        Integer Integer = new Integer(54);
        Double doubleVlaue = new Double(12.25);
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            //System.out.println(i + "------->" + integerArrayList.get(i.Valueof(i)));

        }
        //arraylist needs a class as a datatype it wont go with primitive type
        //it accepts only class String
        //
    }
}