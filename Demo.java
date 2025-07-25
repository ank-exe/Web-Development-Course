import java.util.Scanner;

class A {
    int a;

    void getdata(Scanner sc) {
        System.out.println("Enter a number (a):");
        a = sc.nextInt();
    }
}

class B extends A {
    int b;

    void putdata(Scanner sc) {
        System.out.println("Enter a number (b):");
        b = sc.nextInt();
    }
}

class C extends B {
    void showdata() {
        System.out.println("Addition: " + (a + b));
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        C d = new C();
        d.getdata(sc);    // from class A
        d.putdata(sc);    // from class B
        d.showdata();     // from class C

        sc.close();
    }
}
