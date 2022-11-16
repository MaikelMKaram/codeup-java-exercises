package shapes;

public class Circle {
    public static void main(String[] args){
        Circle circle = new Circle(3);
//        System.out.println("circle.getArea() = " + circle.getArea());
//        System.out.println("circle.getCircumference() = " + circle.getCircumference());
    }

    private double radius;

    //Default constructor
    public Circle(){
    }

    //Overloaded constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Area method
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    //Circumference method
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
