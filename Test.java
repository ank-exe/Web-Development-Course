class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();

    }
}
