import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // inputs the users inputs
        Random rnd = new Random(); // randomizer
        String playAgain = "";
        // asks the user if they wish to play
        System.out.println("Do you want to play? Y/N");
        playAgain = in.nextLine();
        // keeps playing until user says to stop
        while (playAgain.equalsIgnoreCase("Y"))
        {
            // initial roll of the 2 die
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            // outputs the sum of the 2 die
            System.out.println(crapsRoll);
            // if die equals 2 3 or 12 the user loses, and they ask if they want to play again
            if (crapsRoll == 2) {
                System.out.println("craps :(");
                System.out.println("Do you want to play again? Y/N");
                playAgain = in.nextLine();
            } else if (crapsRoll == 3) {
                System.out.println("craps :(");
                System.out.println("Do you want to play again? Y/N");
                playAgain = in.nextLine();
            } else if (crapsRoll == 12) {
                System.out.println("craps :(");
                System.out.println("Do you want to play again? Y/N");
                playAgain = in.nextLine();
                // if die equals 7 or 11 the user wins, abd they ask if they want to play again
            } else if (crapsRoll == 7) {
                System.out.println("You win!");
                System.out.println("Do you want to play again? Y/N");
                playAgain = in.nextLine();
            } else if (crapsRoll == 11) {
                System.out.println("You win!");
                System.out.println("Do you want to play again? Y/N");
                playAgain = in.nextLine();
            }


        }
    }
}