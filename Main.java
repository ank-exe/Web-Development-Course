public class Main{
    static void checkage(int age){
        if(age<18){
        System.out.println("Sorry you are not elligible for voting");}
        else {
        System.out.println("Congratulation you are elligible to vote");
        }
    }
    public static void main(String[] args) {
        checkage(21);
        checkage(14);
    }
}