import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        while (a >= 1) {
            b = b * a;
            a--;
        }
        System.out.println(b);
    }
}
