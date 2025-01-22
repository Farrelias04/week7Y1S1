
public class Forum
{
	public static void main(String args[])
	{
		MessageBoard board = new MessageBoard();
		
		User u1 = new User("Jane Austen", board);
		User u2 = new User("Charles Dickens", board);
		User u3 = new User("George Eliot", board);
		
		
		board.add(u1);
		board.add(u2);
		board.add(u3);
		
		Reader r = new Reader(123, board);
		board.add(r);
		
		Moderator admin = new Moderator("Charlotte Bronte", board);
		board.add(admin);
		
	  	System.out.println(board.getNews());
	  	
	  	u1.post("Pride and Prejudice just published!");
	  	
	  	System.out.println(board.getNews());
	  	
	  	admin.delete();
	  	
	  	System.out.println(board.getNews());
	  	
	}
	
}