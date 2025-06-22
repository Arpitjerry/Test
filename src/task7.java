import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d;
        if (a >= b && a >= c) {
            d = a;
        } else if (b >= a & b >= c) {
            d = b;
        } else {
            d = c;
        }
        System.out.println("Largest number is " + d);
    }
}
