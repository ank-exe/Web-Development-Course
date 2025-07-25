class Triangle {
    int x, y;
    void printArea()
    {
        System.out.println("Area of triangle is: " + x *y / 2);
    }
}

  class shut {
    public static void main(String args[])
    {
        // Object creation
        Triangle t = new Triangle();
        t.x = 10;
        t.y = 20;
        t.printArea();
    }
}