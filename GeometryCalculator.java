import java.util.Scanner;
import java.util.ArrayList;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

class Pyramid {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height;
    }
}



    public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the area of a circle");
            System.out.println("2. Calculate the area of a rectangle");
            System.out.println("3. Calculate the area of a triangle");
            System.out.println("4. Calculate the volume of a cylinder");
            System.out.println("5. Calculate the volume of a sphere");
            System.out.println("6. Calculate the volume of a cone");
            System.out.println("7. Calculate the volume of a pyramid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt();
            
            if (choice == 1) {
            calculateCircleArea(scanner);
            } else if (choice == 2) {
            calculateRectangleArea(scanner);
            } else if (choice == 3) {
            calculateTriangleArea(scanner);
            } else if (choice == 4) {
            calculateCylinderVolume(scanner);
            } else if (choice == 5) {
            calculateSphereVolume(scanner);
            } else if (choice == 6) {
            calculateConeVolume(scanner);
            } else if (choice == 7) {
            calculatePyramidVolume(scanner); 
            } else if (choice == 8) {
            System.out.println("Exiting...");
            break;
            } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 8.");
    }
            System.out.println();
          } while (true);
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the number of circles: ");
        int numCircles = scanner.nextInt();
        Circle[] circles = new Circle[numCircles];

        for (int i = 0; i < numCircles; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            circles[i] = new Circle(radius);
        }

        System.out.println("Calculating areas of circles...");

        for (int i = 0; i < numCircles; i++) {
            Circle circle = circles[i];
            double area = circle.calculateArea();
            System.out.printf("Area of circle %d is: %.2f\n", i+1, area);
        }
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the number of rectangles: ");
        int numRectangles = scanner.nextInt();
        Rectangle[] rectangles = new Rectangle[numRectangles];

        for (int i = 0; i < numRectangles; i++) {
            System.out.print("Enter the length of rectangle " + (i + 1) + ": ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of rectangle " + (i + 1) + ": ");
            double width = scanner.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }

        System.out.println("Calculating areas of rectangles...");

        for (int i = 0; i < numRectangles; i++) {
            Rectangle rectangle = rectangles[i];
            double area = rectangle.calculateArea();
            System.out.printf("Area of rectangle %d is: %.2f\n", i+1, area);
        }
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the number of triangles: ");
        int numTriangles = scanner.nextInt();
        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            System.out.print("Enter the base length of triangle " + (i + 1) + ": ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of triangle " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            triangles[i] = new Triangle(base, height);
        }

        System.out.println("Calculating areas of triangles...");

        for (int i = 0; i < numTriangles; i++) {
            Triangle triangle = triangles[i];
            double area =triangle.calculateArea();
            System.out.printf("Area of triangle %d is: %.2f\n", i+1, area);
        }
    }
    
    private static void calculateCylinderVolume(Scanner scanner) {
        System.out.print("Enter the number of cylinders: ");
        int numCylinders = scanner.nextInt();
        Cylinder[] cylinders = new Cylinder[numCylinders];

        for (int i = 0; i < numCylinders; i++) {
            System.out.print("Enter the radius of cylinder " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of cylinder " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            cylinders[i] = new Cylinder(radius, height);
        }

        System.out.println("Calculating volumes of cylinders...");

        for (int i = 0; i < numCylinders; i++) {
            Cylinder cylinder = cylinders[i];
            double volume = cylinder.calculateVolume();
            System.out.printf("Volume of cylinder %d is: %.2f\n", i+1, volume);
        }
    }

    private static void calculateSphereVolume(Scanner scanner) {
        System.out.print("Enter the number of spheres: ");
        int numSpheres = scanner.nextInt();
        Sphere[] spheres = new Sphere[numSpheres];

        for (int i = 0; i < numSpheres; i++) {
            System.out.print("Enter the radius of sphere " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            spheres[i] = new Sphere(radius);
        }
  
        System.out.println("Calculating volumes of spheres...");

        for (int i = 0; i < numSpheres; i++) {
            Sphere sphere = spheres[i];
            double volume = sphere.calculateVolume();
            System.out.printf("Volume of sphere %d is: %.2f\n", i+1, volume);
        }
    }

    private static void calculateConeVolume(Scanner scanner) {
        System.out.print("Enter the number of cones: ");
        int numCones = scanner.nextInt();
        Cone[] cones = new Cone[numCones];

        for (int i = 0; i < numCones; i++) {
            System.out.print("Enter the radius of cone " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of cone " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            cones[i] = new Cone(radius, height);
        }

        System.out.println("Calculating volumes of cones...");

        for (int i = 0; i < numCones; i++) {
            Cone cone = cones[i];
            double volume = cone.calculateVolume();
            System.out.printf("Volume of cone %d is: %.2f\n", i+1, volume);
        }
    }
    
    private static void calculatePyramidVolume(Scanner scanner) {
        System.out.print("Enter the number of pyramids: ");
        int numPyramids = scanner.nextInt();
        Pyramid[] pyramids = new Pyramid[numPyramids];

        for (int i = 0; i < numPyramids; i++) {
            System.out.print("Enter the base area of pyramid " + (i + 1) + ": ");
            double baseArea = scanner.nextDouble();
            System.out.print("Enter the height of pyramid " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            pyramids[i] = new Pyramid(baseArea, height);
        }

        System.out.println("Calculating volumes of pyramids...");

        for (int i = 0; i < numPyramids; i++) {
            Pyramid pyramid = pyramids[i];
            double volume = pyramid.calculateVolume();
            System.out.printf("Volume of pyramid %d is: %.2f\n", i+1, volume);
        }
    }


}