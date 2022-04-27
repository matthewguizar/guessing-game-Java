/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;
public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Hello, what is your name?");
    String name = userInput.nextLine();
    Random rand = new Random();
    int randomNumber = rand.nextInt(100);

    int answer, guess;

    boolean correct = false;
    answer = randomNumber;

    System.out.println("hey, " + name + " I'm thinking of a number between 1-100. what is it?");
    int counter = 1;
    while (!correct) {

      // guess value
      guess = userInput.nextInt();


      // if guess is greater than actual
      if (guess > answer) {
        System.out.println(guess + " is too high, try again");
        counter++;
      }

      // if guess is less than actual
      else if (guess < answer) {
        System.out.println(guess + " too low, try again");
        counter++;
      }

      // guess is equal to actual value
      else {

        System.out.println("Yes, " + guess + " is the number. In " + counter + " tries.");
        counter++;
        correct = true;
      }

    }

    System.exit(0);
  }
}