public class ShapeArray {
    public static void main(String[] args) {
        Shape sphere = new Sphere(10);
        Shape cylinder = new Cylinder(4, 9);
        Shape cone = new Cone(8, 16);

        Shape[] shapeArray = {sphere, cylinder, cone};

        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i].toString());
        }
    }
}
