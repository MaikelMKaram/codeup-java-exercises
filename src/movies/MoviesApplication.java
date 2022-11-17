package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        //Give the user a list of options for viewing all the movies [completed in line 10] or viewing movies by category.
        Movie[] movArray = MoviesArray.findAll();

        //userInput call
        System.out.println("Pick a movie category: ");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the comedy category");


        Input  myInput = new Input(new Scanner(System.in));
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
        }
    }
}
