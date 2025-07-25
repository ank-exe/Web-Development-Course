
 class animal {
    void eat() {
        System.out.println("eating....");
    }
}

class Dog extends animal {
    void bark() {
        System.out.println("barking....");
    }
}

 class Inheritance {
    public static void main(String[] args) {
        Dog aa = new Dog();
        aa.eat();
        aa.bark();
    }
}
