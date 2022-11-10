import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while ( i <= 15){
//            System.out.print(i++);
//        }

//        int i = -2;
//        do { System.out.println(i += 2);
//        } while (i < 100);

//        int i = 105;
//        do { System.out.println(i -= 5);
//        } while (i > -10);

//        double i = 2;
//        do{ System.out.printf("%.0f\n", i);
//            i = Math.pow(i, 2);
//        } while(i<1_000_000);

//        for(int i = 100; i>=-10; i -=5){
//            System.out.println(i);
//        }
//        for(double i = 2; i<1_000_000; i = Math.pow(i, 2)) {
//            System.out.printf("%.0f\n", i);
//        }


//        ======================= Fizzbuzz ========================

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.


//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz" + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz" + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz" + i);
//            } else {
//                System.out.println(i);
//            }
//        }


//        ======================= Display a table of powers. ========================
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        System.out.print("What number would you like to go up to?  ");
//        int userInt = scanner.nextInt();
//        System.out.println("You selected the number: " + userInt);
//        System.out.println("Here is your table!");
//        System.out.println(" value\t| square\t| cubed");
//        System.out.println(" -----\t| ------\t| -----");
//        for (int i = 0; i <= userInt; i++) {
//            System.out.format(" %-6d\t| %-7.0f\t| %-6.0f\t\n",i, Math.pow(i, 2), Math.pow(i, 3));
//            }

//        ======================= Grade ========================

//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.

        System.out.println("Enter a grade between 0 - 100: ");
        int userGrade = scanner.nextInt();
        if (userGrade >= 88) {
            System.out.println("Your grade of " + userGrade + " means you made an A");
        } else if (userGrade < 88 && userGrade >= 80) {
            System.out.println("Your grade of " + userGrade + " means you made a B");
        } else if (userGrade < 80 && userGrade >= 67) {
            System.out.println("Your grade of " + userGrade + " means you made a C");
        } else if (userGrade < 67 && userGrade >= 60) {
            System.out.println("Your grade of " + userGrade + " means you made a D");
        } else {
            System.out.println("Your grade of " + userGrade + " means you made an F");
        }
    }
}
