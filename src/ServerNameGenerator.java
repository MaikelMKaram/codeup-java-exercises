import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static String randNum(String[] array){
        Random rand = new Random();
        int index = rand.nextInt(array.length) +1 ;
        return array[index];
    }

    public static void main(String[] args) {
        String[] adjectives = {"booming", "slick", "loud", "slow", "metal", "nutty", "smelly", "silly", "silky", "smooth" };
        String[] nouns = {"wax", "magazine", "tiger", "raincoat", "fish", "juice", "armadillo", "chicken", "Karen", "professor"};
        System.out.printf("Your server name is %s-%s",randNum(adjectives), randNum(nouns) );
    }
}