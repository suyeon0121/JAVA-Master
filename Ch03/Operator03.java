package Ch03;

public class Operator03 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println(a > b);
        System.out.println(!(a > b));
        System.out.println((a == b) && (a == 5));
        System.out.println((a != b) && (a == 5));
        System.out.println(!((a != b) && (a == 5)));

    }
    
}
