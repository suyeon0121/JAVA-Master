package Ch10;

import java.util.StringTokenizer;

public class Package10 {
    public static void main(String[] args) {
        
        StringTokenizer str = new StringTokenizer("Welcome to Java Programming!!");

        System.out.println("str.nextElement(): ");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextElement());
        }
    }
}
