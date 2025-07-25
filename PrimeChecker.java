public class PrimeChecker {

    public static boolean isPrime(int number) {
        // Handle edge cases: numbers less than or equal to 1 are not prime.
        if (number <= 1) {
            return false;
        }

        // Iterate from 2 up to the square root of the number.
        // If a number has a divisor greater than its square root,
        // it must also have a divisor smaller than its square root.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by 'i', it's not prime.
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors are found, the number is prime.
        return true;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;
        int num3 = 1;
        int num4 = 2;

        System.out.println(num1 + " is prime: " + isPrime(num1)); // true
        System.out.println(num2 + " is prime: " + isPrime(num2)); // false
        System.out.println(num3 + " is prime: " + isPrime(num3)); // false
        System.out.println(num4 + " is prime: " + isPrime(num4)); // true
    }
}
