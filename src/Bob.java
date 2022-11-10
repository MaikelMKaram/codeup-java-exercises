import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ask Bob A question:");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: \"Sure.\"\n");
            }else if (userInput.endsWith("!")) {
                System.out.println("Bob: \"Whoa, chill out!\"\n");
            }else if (userInput.isEmpty()) {
                System.out.println("Bob: \"Fine. Be that way!\"\n");
            }else {
                System.out.println("Bob: \"Whatever.\"\n");
            } System.out.println("Keep talking to Bob? [y/n]");
            String option = scanner.nextLine();
            if (option.equals("n")) {
                System.out.println("Bob: \"Bye Felicia!\"");
                break;
            }
        }while (true);
    }
}
