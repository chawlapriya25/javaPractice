package rank;

import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\.");//illegal escape charceter
        String[] s = pattern.split("ab.abo.aa.bb/bb.a");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}