import java.util.Scanner;

public class reverseclass {
    int n,rev=0;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        sc.close();
     }
     void putdata(){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("the reverse of this number is"+ rev);
     }
     public static void main(String[] args) {
        reverseclass aa= new reverseclass();
        aa.getdata();
        aa.putdata();
     }
}