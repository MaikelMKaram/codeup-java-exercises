package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        System.out.println("myInput.getString() = " + myInput.getString());
        System.out.println("myInput.yesNo() = " + myInput.yesNo());
        System.out.println("the integer " + myInput.getInt(2,8) + " is within the range I was thinking of");
        System.out.println("getInt() = " + myInput.getInt());
        System.out.println("the number " + myInput.getDouble(1, 10) + " is within the range I was thinking of");
        System.out.println("myInput.getDouble() = " + myInput.getDouble());
    }
}
