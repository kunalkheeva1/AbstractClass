abstract class Shape {
    String color;


    abstract double area();
    public abstract String toString();

    public Shape(String color) {
        System.out.println("Shape one is called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle one is called");
        this.radius= radius;
    }
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public String toString(){
        return "Color of the circle is " + super.getColor()+ " and area is :" + area();
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(String color, double length, double breadth){
        super(color);
        this.breadth= breadth;
        this.length= length;
        System.out.println("Rectangle one is called");
    }
    double area(){
        return length*breadth;
    }
    public String toString(){
        return "Your color is "+ super.getColor() + " and your area is: " + area();
    }
}
public class AbstractClass {
    public static void main(String[] args) {
    Shape kk = new Circle("Red ",23.43);
    Shape kn = new Rectangle("Blue", 23,234);
        System.out.println(kk);
        System.out.println( kn);
    }

}
