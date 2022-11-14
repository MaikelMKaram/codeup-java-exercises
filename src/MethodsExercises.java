import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        addition(2,4);
//        substraction(4,2);
//        multiplication(2,8);
//        division(4,2);
//        modulus(4,2);
//        exercise2(1, 10);
        factorial();
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

    // Exercise 2
    public static int exercise2(int min, int max) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Pick a # between 1 and 10");
        int userNumber = myScanner.nextInt();

        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            exercise2(min, max);
        }
        return userNumber;
    }

    //Exercise 3
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a # between 1 and 10:");
        int userNumb = scanner.nextInt();
        scanner.nextLine();

        if(userNumb < 1 || userNumb > 10){
            factorial();
        } else {
            int result = 1;
            System.out.printf(userNumb + "! = ");
            for (int i = 1; i <= userNumb; i++) {
                result *= i;
                System.out.printf("%d %s", i, i == userNumb ? "" : "x ");
            } System.out.printf("= " + result + "\n");
            System.out.print("\nDo you want to continue? [y/n] ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")){
                factorial();
            } else {
                System.exit(0);
            }
        }
    }
}





