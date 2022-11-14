import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        addition(2,4);
        substraction(4,2);
        multiplication(2,8);
        division(4,2);
        modulus(4,2);
        bonusB(1, 10);
    }

    public static double addition(double one, double two){
        System.out.println(one + two);
        return one + two;
    }

    public static double substraction(double one, double two){
        System.out.println(one - two);
        return one - two;
    }

    //Looping (Exercise 1 Bonus A)
    public static double multiplication(double one, double two){
        double result = 0;
        for (int i = 1; i <= two; i++){
            result += one;
        } System.out.println(result);
        return result;
    }

    public static double division (double one, double two){
        System.out.println(one / two);
        return one / two;
    }

    public static double modulus(double one, double two){
        System.out.println(one % two);
        return one % two;
    }

    // Recursion (Exercise 1 bonus B)
    public static int bonusB(int min, int max) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Pick a # between 1 and 10");
        int userNumber = myScanner.nextInt();

        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            bonusB(min, max);
        }
        return userNumber;
    }


}




