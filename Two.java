import java.util.Scanner;
class Two{
    int a,b;

    void input(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value of a");
    a=sc.nextInt();
    System.out.println("enter a value of b");
    b=sc.nextInt();
    sc.close();
    }

    void output(){
        int c;
        c=a+b;
        System.out.println("addition:"+c);
    }
    public static void main(String[] args) {
        Two aa=new Two();
        aa.input();
        aa.output();
    }


}


