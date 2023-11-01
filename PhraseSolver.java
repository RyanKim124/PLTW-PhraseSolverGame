/*
 * Activity 2.5.2
 *
 *  The class that contains code to play the PhraseSolver game.
 * 
 *  Authors: Sanat Gupta, Ryan Kim, PLTW
 *  Date: 10/30/2023
 * 
 *  The PhraseSolver class of the PhraseSolver game contains the main logic of the game, and it is the class that asks for input and allows the user to enter letters and play the game until someone wins.
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  Player player1; // four attributes of each object - two players, a board, and if it's solved
  Player player2;
  Board board;
  boolean solved;


  /** This method initializes a new PhraseSolver object with two players, a board, and the phrase not being solved. */
  public PhraseSolver()
  {
    this.player1 = new Player(); // initializing two players
    this.player2 = new Player();
    this.board = new Board(); // initializes board
    this.solved = false; // the game is not solved yet
  }

  /** This method starts the game and lets the players enter words and play. */
  public void play()
  {
    boolean solved = false; // the game isn't over yet
    int currentPlayer = 1; // there's only one player right now, might be more later

    Scanner input = new Scanner(System.in); // going to ask for the user's guess
    
    boolean correct = true; // is the guess correct or not
    while (!solved) // while the game isn't over, this loop will continue running
    {
      
      /* your code here - game logic */

      System.out.print("Current Player: ");
      if (currentPlayer == 1)
      {
        System.out.println(player1.getName());
      }
      else if (currentPlayer == 2)
      {
        System.out.println(player2.getName());
      }
      System.out.println("Partially Solved Phrase: " + board.getPartialPhrase());
      System.out.println("Current letter value: " + board.getLetterValue());
      
      /* your code here - determine how game ends */
      solved = true; // the game ends when the phrase is found and solved becomes true
    } 
   
  }
  
}