import java.util.Scanner;

public class thresum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        a = sc.nextInt();
        System.out.println("Enter number");
        b = sc.nextInt();
        System.out.println("Enter number");
        c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("a is the greatest");
        else if (b > a && b > c)
            System.out.println("b is the greatest");
        else
            System.out.println("c is the greatest");
        sc.close();

    }
}