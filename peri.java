class perimeter {
    int x, y, z;

    void printPerimeter() {
        System.out.println("perimeter of triangle is: " + x + y + z);
    }
}

class peri {
    public static void main(String args[]) {
        // Object creation
        perimeter t = new perimeter();
        t.x = 10;
        t.y = 20;
        t.z = 30;
        t.printPerimeter();
    }
}