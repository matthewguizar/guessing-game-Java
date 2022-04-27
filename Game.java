/*

A number-guessing game.

*/
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Hello, what is your name?");
    String name = userInput.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100. Try to guess my number.");

  }

}
