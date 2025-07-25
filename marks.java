import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
    int m1,m2,m3;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first student mark");
    m1=sc.nextInt();
    System.out.println("enter second student mark");
    m2=sc.nextInt();
    System.out.println("enter third student mark");
     m3=sc.nextInt();
    sc.close();

    float avg=(m1+m2+m3)/3;
    System.out.println("the average mark of students is:"+avg);
    if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        System.out.println("Congratulation, You are passed.");
    else
        System.out.println("Unfortunately, you donot make it SORRY!");
    }
    
    }
      

