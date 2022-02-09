import java.util.Scanner;

public class RockPaperScissors {

    public static void main (String [] args){
        // go to game method.
        game();
    }

    public static void game(){
        // Game initiated.

        // key for indefinite loop.
        int key = 0;

        // count for how many times you continued in rock paper and scissors without losing any games.
        int count = 0;

        // Ready for user input.
        Scanner myObj = new Scanner(System.in);

        // Storyline:
        System.out.println("......");

        System.out.println("...........");

        System.out.println("................");

        System.out.println(".");

        System.out.println("+-----------------------------------------------------------------------------------------------------------------+");

        System.out.println("Hello, Welcome to the game, Rock Paper and Scissors! ");

        System.out.println("In our game, remember, rock wins against scissors; paper wins against rock; and scissors wins against paper.");

        System.out.println("Now, let's start your journey to the game! ----\"『　　』 never loses!\" ");

        // An indefinite loop to play rock paper scissors.
        while (key != 1){

            // count increases
            count++;

            // Game hints:
            System.out.println("+-----------------------------------------------------------------------------------------------------------------+");

            System.out.println("Round: " + count);

            System.out.println("1. Rock. ");

            System.out.println("2. Paper. ");

            System.out.println("3. Scissors. ");

            System.out.println("Enter your choice: ( 1 / 2 / 3 ) ");

            // take user input
            int option = myObj.nextInt();

            // create a random number between 1 and 3.
            int cmp_op = (int)(Math.random()*3) + 1;

            // go to evaluate method to figure out whether user wins or not
            evaluate(option, cmp_op);

        }
    }

    public static void evaluate(int yourOp, int cmpOp){

        // Figure out which situation the game is currently at.
        boolean Rs = (yourOp == 1) && (cmpOp == 3);
        boolean Rp = (yourOp == 1) && (cmpOp == 2);
        boolean Rr = (yourOp == 1) && (cmpOp == 1);
        boolean Pr = (yourOp == 2) && (cmpOp == 1);
        boolean Ps = (yourOp == 2) && (cmpOp == 3);
        boolean Pp = (yourOp == 2) && (cmpOp == 2);
        boolean Sp = (yourOp == 3) && (cmpOp == 2);
        boolean Sr = (yourOp == 3) && (cmpOp == 1);
        boolean Ss = (yourOp == 3) && (cmpOp == 3);

        // if the user is losing, print the result, initiate the game.
        if ( Rp || Ps || Sr){
            if (Rp) {
                System.out.println("Your choice is Rock. ");
                System.out.println("Our choice is Paper. ");
                System.out.println();
            } else if (Ps) {
                System.out.println("Your choice is Paper. ");
                System.out.println("Our choice is Scissors. ");
                System.out.println();
            } else{
                System.out.println("Your choice is Scissors. ");
                System.out.println("Our choice is Rock. ");
                System.out.println();
            }
            System.out.println("...... You... are... not... 『　　』 ");
            System.out.println("Who are you...");
            System.out.println();
            game();

        // if the user is winning, print the result, end this method.
        } else if (Rs || Pr ||Sp){
            if (Rs) {
                System.out.println("Your choice is Rock. ");
                System.out.println("Our choice is Scissors. ");
                System.out.println();
            } else if (Pr) {
                System.out.println("Your choice is Paper. ");
                System.out.println("Our choice is Rock. ");
                System.out.println();
            } else{
                System.out.println("Your choice is Scissors. ");
                System.out.println("Our choice is Paper. ");
                System.out.println();
            }
            System.out.println("It's YOU! ");
            System.out.println("『　　』, Welcome back!");
            System.out.println("Let's have more fun! ");
            System.out.println();

        // if the user is getting a tie, print the result, end this method.
        } else if (Rr || Pp || Ss) {

            if (Rr) {
                System.out.println("Your choice is Rock. ");
                System.out.println("Our choice is Rock. ");
                System.out.println();
            } else if (Pp) {
                System.out.println("Your choice is Paper. ");
                System.out.println("Our choice is Paper. ");
                System.out.println();
            } else{
                System.out.println("Your choice is Scissors. ");
                System.out.println("Our choice is Scissors. ");
                System.out.println();
            }

            System.out.println("...");
            System.out.println("It's okay, let's play it one more time. ");
            System.out.println();

        // if the user input something other than 1, 2, and 3, print the alert, initiate the game.
        } else {
            System.out.println("ALERT! ALERT! SOMETHING WENT WRONG! ");
            System.out.println();
            game();
        }

    }

}
