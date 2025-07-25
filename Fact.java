import java.util.Scanner;
public class Fact {
    public static void main(String[] args) 
    {
        int n, fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        
        while(n>0||n>=1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println(" Factorial of this number is: "+fact);
        sc.close();

    }
}
