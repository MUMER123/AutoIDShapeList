public class Circle extends Shape{
    private double radius;
    public Circle (){
        super();
        this.radius = 0;
    }
    public Circle(int radius){
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public String draw(){
        return "This is a Circle";
    }
    public String getArea() {
        return "Area of the Circle is: " + 3.14 * this.radius * this.radius;
    }


}
