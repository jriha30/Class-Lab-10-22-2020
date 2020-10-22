import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfBag
{
	private ArrayList <GolfClub> bagOfClubs;
	
	public GolfBag()
	{
		this.bagOfClubs = new ArrayList<GolfClub>();
	}
	
	public GolfBag(String fileName)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + fileName));
			while(input.hasNext())
			{
				this.bagOfClubs.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}
	
	public ArrayList<GolfClub> getBagOfClubs()
	{
		return this.bagOfClubs;
	}
	
	public void display()
	{
		for(GolfClub s : this.bagOfClubs)
		{
			s.display();
		}
	}
}