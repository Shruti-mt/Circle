package Circle;

public class RectanglePerimeter {
    private double length;
    private double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectanglePerimeter rectangle = new RectanglePerimeter(10, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}