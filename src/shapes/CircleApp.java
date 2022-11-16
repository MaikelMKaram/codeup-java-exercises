package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        Input myInput = new Input(new Scanner(System.in));
        System.out.println("\nInput the radius of your circle");
        double circleRadius = myInput.getDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getCircumference() = " + circle.getCircumference());
    }
}
