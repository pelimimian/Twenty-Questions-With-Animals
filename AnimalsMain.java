/*Peter Elimimian
 * Project 2
 * CPSC 330
 * October 10, 2014
 */

import java.util.Scanner;


public class AnimalsMain {

	public static AnimalBinaryTree myTree;
	
	static String bA = "Empty";
	static String question = "Empty";
	static String yes = "Empty";
	static String no = "Empty";

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 newGame();
		 myTree.inquiry();
		 
		 while(playAgain())
		 {
			myTree.inquiry();
		 }
	}
	/*
	 * Checking to see if the player wants to continue on with the game.
	 */
		 public static boolean playAgain()
		 {
			 System.out.println("Would you like to play again? ('y' or 'n') ");
			 bA = input.next();
			 
			 if(bA.equals("y"))
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
	
		}
		 /*
		  * Creating a new game by recieving initial inputs of the
		  * question, the correct animal to the question, the wrong animal
		  * to the question and creating a new tree object that will
		  * hold all three string inputs.
		  */
		 public static void newGame()
		 {
			 System.out.println("Ok. Think of an animal."); 

				 System.out.println("Enter a question about an animal:");
			 	 question = input.nextLine();
			 	 System.out.println("Name an animal satifies that description: ");
			 	 yes = input.next();
			 	 System.out.println("Name an animal satifies that doesn't description: ");
			 	 no = input.next();
			 	 myTree = new AnimalBinaryTree(question, yes, no);
			 
		 }
}
