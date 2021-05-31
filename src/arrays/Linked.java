package arrays;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> li2= new LinkedList<>(  );
        li2.add(3);
        li2.add(2);
        li2.add(3);
        li.add(4);
        li.add(5);
        li.add(2);
        li.addFirst(9000);
        li.pop();
        li.add(2);
        li.add(8);
        li.add(0,1);
        li.addAll(0,li2);
        System.out.println(li.contains(7));
        System.out.println(li.indexOf(20));  System.out.println(li.lastIndexOf(2));
        // li.clear();
        li.set(1,677);
        System.out.println(li.isEmpty());
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i));
            System.out.print(",");
        }
    }
}


