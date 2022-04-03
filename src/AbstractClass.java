import java.io.*;

abstract class Shape{
    String name;
    Shape(String name){
        this.name= name;
    }
    public void moveTo(int x, int y){
        System.out.println(this.name +" has movement from "+ x+ " to "+y);
    }
    abstract double area();
}

class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth, String name){
        super(name);
        this.breadth= breadth;
        this.length= length;
        System.out.println("Area of Rectangle is: " +area());
    }
    double area(){
        return length*breadth;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius, String name){
        super(name);
        this.radius= radius;
        System.out.println("Area of circle is: "+ area());
    }
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Circle cc = new Circle(2,"Circle");
        cc.moveTo(2,3);
        Rectangle rr = new Rectangle(23,34,"Rectangle");
        rr.moveTo(6,3);


    }
}