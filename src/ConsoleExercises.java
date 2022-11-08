import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n",pi);

//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");
//
//        System.out.print("Enter 3 words: ");
//        String userInput = scanner.next();
//        String userInputTwo = scanner.next();
//        String userInputThree = scanner.next();
//        System.out.println("You entered: --> \"" + userInput + "," + userInputTwo + ", and " + userInputThree + "\" <--");
//
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter a values for the length and width of our CodeUp classroom respectively: ");
        float userLength = scanner.nextFloat();
        float userWidth = scanner.nextFloat();
        float areaOfRoom = ((userWidth + userLength) * 2);
        System.out.println("Area of the room is: --> \"" + areaOfRoom + "\" <--");
    }
}
