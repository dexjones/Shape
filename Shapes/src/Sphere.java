public class Sphere extends Shape {
    private double radius; // attribute radius

    public Sphere(double radius) { // parameterized constructor
        this.radius = radius;
    }
    @Override
    public double surface_area() { // formula to find surface area of a sphere
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume() { // formula to find volume of sphere
        return ((4.0 / 3) * Math.PI * Math.pow(radius, 3));
    }

    public String toString() {
        return "Sphere:\n\tSurface Area: " + String.format("%.4f", surface_area()) + " cm² \n\tVolume: " + String.format("%.4f", volume()) + " cm³";
    }
}
