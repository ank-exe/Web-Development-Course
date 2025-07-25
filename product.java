import java.util.Scanner;
public class product {
    public static void main(String[] args) 
    {
        int n, product=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        while(n>0){
            product=product*n%10;
            n=n/10;
        }
        System.out.println("Product of the number is:"+ product);
        sc.close();
    }
}