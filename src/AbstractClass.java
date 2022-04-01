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
        return "Color of the circle is " + super.color+ " and area is :" + area();
    }

}








public class AbstractClass {
    public static void main(String[] args) {

    }

}
