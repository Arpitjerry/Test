import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b=sc.nextDouble();
        int f=0;
        double e=a+b*f+(a+b-f);
        System.out.println(e);
        double c=a+b;
        System.out.println("Implicit Casting: "+c);
        int d=a+(int)b;
        System.out.println("Explicit Casting: "+d);



    }
}
