public class Moderator extends User
{
	
	public Moderator(String name, MessageBoard board)
	{
		super(name, board);
	}
	
	public void delete()
	{
		board.setNews("no news");
	}
}