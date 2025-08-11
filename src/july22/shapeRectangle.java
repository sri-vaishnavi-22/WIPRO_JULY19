package july22;

class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class shapeRectangle {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}

