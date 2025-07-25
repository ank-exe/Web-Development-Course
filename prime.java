import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        int n, i=1, count=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number");
        n=sc.nextInt();
        while(i<=n)
        {
            if(n%i==0)
            count++;
            i++;
        }
        if(count==2)
        System.out.println("this is a prime number");
        else
        System.out.println("this is not a prime number");
        sc.close();
    }
}