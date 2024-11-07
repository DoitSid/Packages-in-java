//This package is build to build easy geometry related codes using oop - siddhi

public package Mathematics;

public class Geometry {
    // Area of a Circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Circumference of a Circle
    public static double circumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    // Area of a Rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Perimeter of a Rectangle
    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    // Area of a Triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}
 {
    
}
