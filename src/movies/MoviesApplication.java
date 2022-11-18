package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        choiceList();
    }

    public static void choiceList(){

        //Give the user a list of options for viewing all the movies or viewing movies by category.
        Movie[] movArray = MoviesArray.findAll();

        // userInput call
        System.out.print("\nPick a movie category: \n" +
                "0 - exit \n" +
                "1 - view all movies \n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category\n");

        Input myInput = new Input(new Scanner(System.in));
        int userChoice = myInput.getInt();

        for (int i = 0; i < movArray.length; i++) {
//            System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            if(userChoice == 0){break;
            } else if (userChoice == 1){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 2 && movArray[i].getCategory().equalsIgnoreCase("animated")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 3 && movArray[i].getCategory().equalsIgnoreCase("drama")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 4 && movArray[i].getCategory().equalsIgnoreCase("horror")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 5 && movArray[i].getCategory().equalsIgnoreCase("scifi")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 6 && movArray[i].getCategory().equalsIgnoreCase("musical")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            } else if (userChoice == 7 && movArray[i].getCategory().equalsIgnoreCase("comedy")){
                System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
            }
        } if (userChoice == 0){
        } else {
            choiceList();
        }
    }
}
