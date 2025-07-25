
import java.util.Scanner;

public class addclass {
    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        sc.close();
    }

    void putdata() {
        System.out.println("Addition:"+(a+b));
        
    }
    public static void main(String[] args) {
        addclass aa=new addclass();
        aa.getdata();
        aa.putdata();

    }
}
