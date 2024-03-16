public class Cylinder extends Shape {
    private double radius, height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double surface_area() {
        return (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }
    public String toString() {
        return "Surface Area: " + surface_area() + "\nVolume: " + volume();
    }
}
