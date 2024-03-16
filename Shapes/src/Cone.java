public class Cone extends Shape{
    private double radius, height; // attributes needed, radius and height
    public Cone(double radius, double height) { // parameterized constructor
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double surface_area() { // formula to find surface area of cone
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height,2) + Math.pow(radius, 2))));
    }
    @Override
    public double volume() { // formula to find volume of cone
        return ((1.0 / 3) * Math.PI * Math.pow(radius, 2) * height);
    }
    public String toString() {
        return "Cone:\n\tSurface Area: " + String.format("%.4f", surface_area()) + " cm² \n\tVolume: " + String.format("%.4f", volume()) + " cm³";
    }
}
