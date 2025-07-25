interface Animal{
   public void animalsound();
   public void sleep();
}
 class Pig implements Animal{
    public void animalsound(){
        System.out.println("pig sounds like wiz wiz...");
    }
     public void sleep(){
        System.out.println("Zzzz....");
    }
 } 
 class Interfaces{
    public static void main(String[] args) {
        Pig aa=new Pig();
        aa.animalsound();
        aa.sleep();

    }
 }