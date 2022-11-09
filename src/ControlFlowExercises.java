public class ControlFlowExercises {
    public static void main(String[] args) {

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


//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.


        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            } else {
                System.out.println(i);
            }
        }


    }
}
