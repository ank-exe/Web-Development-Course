
public class car {
    String brand;
    String model;
    int year;

    // Parameterized Constructor
    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // No-Argument Constructor
    public car() {
        System.out.println("Default Car created.");
    }

    public static void main(String[] args) {
        // Using the parameterized constructor
        car myCar = new car("Ford", "Mustang", 2020);
        System.out.println("My car: " + myCar.brand + " " + myCar.model + " " + myCar.year);

        // Using the no-argument constructor
        car anotherCar = new car("Omni", "toyota", 2021);
        System.out.println("anotherCar:"+ anotherCar.brand + " "+anotherCar.model+ " "+ anotherCar.year);
    }
}