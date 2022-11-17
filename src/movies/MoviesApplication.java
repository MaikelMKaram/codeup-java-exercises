package movies;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] movArray = MoviesArray.findAll();
        for (int i = 0; i < movArray.length; i++) {
            System.out.println(movArray[i].getName() + " | " + movArray[i].getCategory());
        }
    }
}
