
/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player {
  /* your code here - attributes */
  private int points;
  private String name;

  /* your code here - constructor(s) */
  public Player() {
    this.points = 0;

    System.out.println("Enter Player Name:");
    Scanner s = new Scanner(System.in);
    String newName = s.nextLine();

    this.name = newName;
    System.out.println("Welcome to the game " + name + "!");
  }

  public Player(String name) {
    this.points = 0;
    this.name = name;
    System.out.println("Welcome to the game " + name + "!");
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s) */
}