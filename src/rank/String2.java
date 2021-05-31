package rank;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l=A.length();
        char ch[] = A.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--) {
            rev += ch[i];
        }
    /* Enter your code here. Print output to STDOUT. */
            if(A.equals(rev)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }


        }


}
