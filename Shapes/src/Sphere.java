public class Sphere extends Shape {
    private double radius; // attribute radius

    public Sphere(double radius) { // parameterized constructor
        this.radius = radius;
    }
    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public String toString() {
        return "Surface Area: " + surface_area() + "\nVolume: " + volume();
    }
}
