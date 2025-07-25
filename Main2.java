public class Main2 {
    int modelyear;
    String modelname;

    // Correct constructor (no return type, same name as class)
    Main2(int year, String name) {
        modelyear = year;
        modelname = name;
    }

    public static void main(String[] args) {
        Main2 mycar = new Main2(1969, "Mustang");
        System.out.println("My car is: " + mycar.modelname + " " + mycar.modelyear);
    }
}


