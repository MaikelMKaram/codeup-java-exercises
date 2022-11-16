package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Input myInput = new Input(new Scanner(System.in));
//        System.out.println("myInput.getString() = " + myInput.getString());
//        System.out.println("myInput.yesNo() = " + myInput.yesNo());
//        System.out.println("the integer " + myInput.getInt(2,8) + " is within the range I was thinking of");
//        System.out.println("getInt() = " + myInput.getInt());
//        System.out.println("the number " + myInput.getDouble(1, 10) + " is within the range I was thinking of");
//        System.out.println("myInput.getDouble() = " + myInput.getDouble());
    }

    //Private scanner property/field
    private Scanner scanner;

    //Constructor
    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    //methods
    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("\n[Yes/No]");
        String nextLine = this.scanner.nextLine();
        return (nextLine.equalsIgnoreCase("y") || nextLine.equalsIgnoreCase("yes") || nextLine.equalsIgnoreCase("true"));
    }

    public int getInt(int min, int max){
        System.out.println("\nI'm thinking of a range of numbers. Please guess a integer within that range");
        int num = scanner.nextInt();
        if (num < min || num > max){
            return getInt(min, max);
        } else {
            return num;
        }
    }

    public int getInt(){
        System.out.println("\nPlease provide a integer");
        int num = scanner.nextInt();
        System.out.println("integer = " + num);
        return num;
    }

    public double getDouble(double min, double max){
        System.out.println("\nI'm thinking of a range of numbers. Please guess a number within that range");
        double num = scanner.nextDouble();
        if (num < min || num > max){
            return getDouble(min, max);
        } else {
            return num;
        }
    }

    public double getDouble(){
        System.out.println("\nPlease provide a number");
        double num = scanner.nextDouble();
        System.out.println("num = " + num);
        return num;
    }

}
