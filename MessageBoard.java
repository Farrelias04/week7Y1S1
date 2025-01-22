
import java.util.ArrayList;

public class MessageBoard
{
	private String news;
	private ArrayList<Subscriber> members;
	
	public MessageBoard()
	{
		news = "no news";
		members = new ArrayList<Subscriber>();
	}
	
	public void add(Subscriber m)
	{
		members.add(m);
	}
	
	public void setNews(String news)
	{
		this.news = news;
		for(Subscriber m: members)
		{
			m.alert();
		}
	}
	
	public String getNews()
	{
		return news;
	}
}