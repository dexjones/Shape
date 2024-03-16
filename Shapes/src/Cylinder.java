public class Cylinder extends Shape {
    private double radius, height; // attributes needed for cylinder, radius and height
    public Cylinder(double radius, double height) { // parameterized constructor
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double surface_area() { //formula to find surface area of cylinder
        return (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public double volume() {// formula to find volume of Cylinder
        return (Math.PI * Math.pow(radius, 2) * height);
    }
    public String toString() {
        return "Cylinder:\n\tSurface Area: " + String.format("%.4f", surface_area()) + " cm² \n\tVolume: " + String.format("%.4f", volume()) + " cm³";
    }
}
