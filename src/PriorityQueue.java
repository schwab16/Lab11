
public class PriorityQueue<Base> {
	
	private class Node  
	{  
		private Base object;  
	    private int rank;  
	    private Node left;  
	    private Node right;  
	  
	    private Node(Base object, int rank)  
	    {  
	    	this.object = object;  
	    	this.rank = rank;  
	    	left = null;  
	      	right = null;  
	    }
	}
	
	private Node root;  //  Root node of the BST.
	private Node head;
	//
	public PriorityQueue()
	{
		head = new Node(null,7);
		root = head;
		head.left = root;
		
	}
	
	public Base dequeue()
	{
		Node above = head;
		Node below = root;
		if(isEmpty())
		{
			throw new IllegalArgumentException("Queue is empty");
		}
		else
		{
			while(below.left!=null)
			{
				above = below;
				below=below.left;
			}
			above.left = null;
			
		}
	}
	
	
	public void enqueue(Base object, int rank)
	{
		
	}
	
	public boolean isEmpty()
	{
		
	}

}
