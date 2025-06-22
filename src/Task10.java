import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String c = sc.next();
        switch (c) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                if (b > 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Error : Division by zero");
                }
                break;
            }
            default: {
                System.out.println("Invalid operator");
            }
            break;
        }
    }
}