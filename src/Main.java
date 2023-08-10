public class Main {
    public static void main(String[] args) {
        ShapeList list =  new ShapeList();
        list.addShape(new Square(4));
        list.addShape(new Rectangle(2,6));
        list.addShape(new Circle(3));
        list.addShape(new Triangle(3,4));
        list.addShape(new Square(5));
        list.removeShape(0);
        list.traversal();

    }
}