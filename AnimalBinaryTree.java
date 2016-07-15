/*Peter Elimimian
 * Project 2
 * CPSC 330
 * October 10, 2014
 */

public class AnimalBinaryTree {
	//Creating the head or root.
	AnimalNode head;
	
	/*
	 * Creating a constructor has the head point to a question,
	 * setting the yes node to equal to a new Animal Node object equal
	 * to yes and no strings.
	 */
	public AnimalBinaryTree (String question, String yes, String no)
	{
		head = new AnimalNode(question);
		head.setYesNode(new AnimalNode(yes));
		head.setNoNode(new AnimalNode(no));
	}
	/*
	 * Creating multiple node recursively.
	 */
	public void inquiry()
	{
		head.inquiry();
	}

}
