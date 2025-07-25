// Method overloading happens when there are two methods having same name but different parameters
public class Methodoverloading {
    static int fool(int x, int y) {
        return x + y;
    }

    static double fool(double x, double y) {
        return x + y;
    }


public static void main(String[] args) {
    int a = fool(8, 5);
    double b = fool(4.3, 6.26);
    System.out.println("int:" + a);
    System.out.println("double:" + b);
    System.out.println("the value of int:"+(fool(5,3)));
    System.out.println("the value of double is:"+(fool(4.3,6.26)));

}}
