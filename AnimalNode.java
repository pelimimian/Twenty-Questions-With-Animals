import java.util.Scanner;

/*Peter Elimimian
 * Project 2
 * CPSC 330
 * October 10, 2014
 */


public class AnimalNode {

	Scanner input = new Scanner(System.in);
	
    AnimalNode yesNode; 
    AnimalNode noNode; 
    String gameMessage;
    String binaryAnswer;
    String animalAnswer;
    String inquiryAnswer;
    AnimalNode newNode;

    //Creating a constructor that reads in a message
    public AnimalNode(String newMessage)
    {
    	gameMessage = newMessage;
    	noNode = null;
    	yesNode = null;
    }
    
    /*
     * Handles what to do when presented a new question, if the person
     * say yes the tree will travel down the "yes" leaf by calling itself
     * recursively. Same goes it the person answers no. If there is no new 
     * question it guess the animal.
     */
    public void inquiry()
    {
    	if(this.newQuestion())
    	{
    		System.out.println(this.gameMessage);
    		
    		binaryAnswer = input.next();
    		
    		if (binaryAnswer.equals("y"))
    		{
    			yesNode.inquiry();
    		}
    		else if (binaryAnswer.equals("n"))
    		{
    			noNode.inquiry();
    		}
    	}
    	else {
    		this.guessAnimal();
    	}
    }
    /*
     * Guesses the animal. If correct, the computer wins, if not
     * the game will update itself.
     */
    public void guessAnimal()
    {
    	System.out.println("Are you thinking of a(n) " + this.gameMessage + "?");
        System.out.println("Enter 'y' or 'n'");
        binaryAnswer = input.next();
        if (binaryAnswer.equals("y"))
        {
        	System.out.println("I win!");
        }
        else{
        	updateMemory();
        }
    }

    /*
     * This will update the games memory. If the user selects no, then
     * the function will calls its node and assign a new AnimalNode object
     * that will have the no node point the question and the yes node point
     * to the animal. If the user selects yes, then it would be vice-versa.
     */
    public void updateMemory()
    {
    	System.out.println("I give up. What is it? ");
    	animalAnswer = input.next();
    	System.out.println("What question would tell me that it's a(n) " + animalAnswer + " ?");
		input.nextLine();
		inquiryAnswer = input.nextLine();
		if(binaryAnswer.equals("n"))
		{
			this.noNode = new AnimalNode(this.gameMessage);
			this.yesNode = new AnimalNode(animalAnswer);
		}
		else
		{
			this.yesNode = new AnimalNode(this.gameMessage);
			this.noNode = new AnimalNode(animalAnswer);
		}
		
		this.setMessage(inquiryAnswer);
    }
    	/*
    	 * Checks to see if the nodes point to anything.
    	 * 
    	 */
		public boolean newQuestion()
		{
			if(noNode == null && yesNode == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		// Setting the game message to a new message
		   public void setMessage(String newMessage)
	        {
	            gameMessage = newMessage;
	        }
	
	        public String getMessage()
	        {
	            return gameMessage;
	        }
	     // Setting the no node to a new node
	        public void setNoNode(AnimalNode node)
	        {
	            noNode = node;
	        }
	        public AnimalNode getNoNode()
	        {
	            return noNode;
	        }
	     // Setting the yes node to a new node
	        public void setYesNode(AnimalNode node)
	        {
	            yesNode = node;
	        }
	        public AnimalNode getYesNode()
	        {
	            return yesNode;
	        }
    }

