package lab7;

public class ex1 {
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * height;
    }
}

class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(super.getRadius(), 3);
    }
}
