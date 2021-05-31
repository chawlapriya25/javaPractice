package excercise;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int count=0;
        int lar=0;
        for(int i=0;i<10;i++){
            Scanner sc=  new Scanner(System.in);
            int n= sc.nextInt();
            count++;
            if(n>lar){
                lar=n;

            }
        }
        System.out.println(count);
        System.out.println(lar);
    }
}
