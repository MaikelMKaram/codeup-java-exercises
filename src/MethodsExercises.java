import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        addition(2,4);
        substraction(4,2);
        multiplication(2,3);
        division(4,2);
        modulus(4,2);
    }
    public static double addition(double one, double two){
        System.out.println(one + two);
        return one + two;
    }
    public static double substraction(double one, double two){
        System.out.println(one - two);
        return one - two;
    }
    public static double multiplication(double one, double two){
        System.out.println(one * two);
        return one * two;
    }
    public static double division (double one, double two){
        System.out.println(one / two);
        return one / two;
    }

    public static double modulus(double one, double two){
        System.out.println(one % two);
        return one % two;
    }

}




