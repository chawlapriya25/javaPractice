package arrays;

import java.util.ArrayDeque;

public class deq {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(6);
        ad1.add(5);
        ad1.add(9);
        ad1.addFirst(67);
        ad1.removeFirst();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getLast());
    }
}
