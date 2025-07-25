import java.util.Scanner; // Import the Scanner class

 public class summ {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner sc = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x = sc.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = sc.nextInt(); // Read user input

    sum = x + y;  // Calculate the sum of x + y
    System.out.println("Sum is: " + sum); // Print the sum
    sc.close();
  }
}