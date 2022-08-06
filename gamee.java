import java.util.Random;
import java.util.Scanner;

class game {
    int rand_num;
    int user_inp;
    public int no_of_tries = 0;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public game() {
        rand_num = random.nextInt(10);
    }

    void getinput() {
        System.out.println("---------------------------------------------");
        System.out.println("Computer has guessed the game. Enter your guess!");
        System.out.println("---------------------------------------------");
        System.out.println("Guess the number between 1-10: ");
        user_inp = sc.nextInt();
    }

    void is_correct_num() {
        while (user_inp != rand_num) {
            if (user_inp > rand_num) {
                System.out.println("You number is greater than guessed number. please guess lesser number.");
                getinput();
                no_of_tries++;
            } else if (user_inp < rand_num) {
                System.out.println("you number is lesser than guessed number. please guess greater again.");
                getinput();
                no_of_tries++;
            }
        }
        System.out.println("You guessed the right number! ");
        System.out.println("Guessed number: " + rand_num);
        System.out.println("you number: " + user_inp);
        System.out.println("Your score: " + no_of_tries);
    }
};

public class gamee {
    public static void main(String[] args) {
        game g1 = new game();
        g1.getinput();
        g1.is_correct_num();
    }
}