//Task 1 Guess the Number .?
// Cognorise Infotech //
import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        // Random() method is used to generate Random Numbers.
        Random rd = new Random();

        // int[] arr = new int[100];
        int i = rd.nextInt(101);
        System.out.println(i); // Random number is printed in int i..
        // ----- The, Above Line is Printed only for Demonstration purposes.. //---

        int z = 2; // Max. Number of Attempts ---(1)
        for (int arr = 0; arr <= z; arr++) {
            System.out.println("Enter Your Guess for The Number ..?"); // User has to Guess the Number..
            int x = S.nextInt(); // User, input is stored here using Scanner Class..

            // Here the condition is given that if (x == i), execute this code..
            // Value of x is User Input.. & Value of i is random() generated number ..
            if (x == i) {
                System.out.println("Your Guess is Correct !");
                // break;
                if (arr <= z) {
                    // if (arr <= z), then execute this block..
                    // Here, the value of z is 2 ....(from eqn. (1))
                    if (arr == 1) {
                        System.out.println("It, took You " + arr + " attempt to Guess...!");
                    } else {
                        System.out.println("It, took You " + arr + " attempts to Guess...!");
                    }
                    // break;
                    System.out.println("============");
                    System.out.println("Play Again ? Y/N");
                    String choice = S.next();

                    if (choice.equalsIgnoreCase("Y")) { // If User Input's Value is "Y", then execute code..
                        System.out.println("You, chose to Continue....");
                        for (int second = 0; second < z; second++) {
                            // System.out.println("-======-----------======");
                            // For loop, for executing the loop again.....//
                        }
                    } else {
                        System.out.println("You, Chose to Quit..");
                        // break;
                        System.out.println("-======-----------======");
                        System.out.println("|       S C O R E      | ");
                        System.out.println("-======-----------======");
                        System.out.println("|  The, Random Number  |");
                        System.out.println("-======-----------======");
                        System.out.println("|     was Guessed By   |");
                        System.out.println("|        User in:      |");
                        System.out.println("-======-----------======");
                        System.out.println("-======-----------======");
                        System.out.println("|      Attempts: " + arr + "     |");
                        System.out.println("-======-----------======");
                        break;
                    }
                }
            } else if (x < i) {
                // int a = arr + 1;
                System.out.println("Your, Guess was too Low....");
                // System.out.println("You, have " + (a) + " attempt left !");
                // Your, attempts remaining..
            } else if (x > i) {
                System.out.println("Your, Guess was too High....");
            }
        }
        System.out.println("G A M E - O V E R...");
        System.out.println("You've, exceeded your Max Attempts..");
    }
}
