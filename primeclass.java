import java.util.Scanner;

public class primeclass {
    int n;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        sc.close();
    }

    void putdata() {
        int i, count = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            
        }
        if (count == 2)
            System.out.println("this is a prime number");
        else
            System.out.println("this is not a prime number");
    }

    public static void main(String[] args) {
        primeclass aa = new primeclass();
        aa.getdata();
        aa.putdata();
    }

}