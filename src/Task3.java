import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean b1 = (a == b);
        System.out.println("a==b: " + b1);

        boolean b2 = (a > b);
        System.out.println("a > b: " + b2);

        boolean b3 = (a < b);
        System.out.println("a < b: " + b3);

        boolean b4 = (a > b) && (a>0);
        System.out.println("(a > b) && (a>0): " + b4);

        boolean b5 = (a < b) || (a>0);
        System.out.println("(a < b) || (a>0): " + b5);

        boolean b6 = !(a>b);
        System.out.println("!(a>b): " + b6);
    }
}
