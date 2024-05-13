package Geometric_Assiment;

 interface Colorable {
    void howToColor();
}

 abstract class GeometricObject {
    public abstract double getArea();
}

 class Square extends GeometricObject implements Colorable {
    private double side; // Side of the square

    public Square() {
        this.side = 0; // No-arg constructor with side 0
    }

    public Square(double side) {
        this.side = side; // Constructor with specified side
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

public class TestGeometricObjects {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5.0);
        objects[1] = new Square(7.5);
        objects[2] = new Square(0); // No-arg constructor example
        objects[3] = new Square(3.3);
        objects[4] = new Square(4.4);

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}
