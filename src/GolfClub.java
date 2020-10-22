public class GolfClub
{
	private String name;
	private int distance;
	
	public GolfClub(String name, int distance)
	{
		this.name = name;
		this.distance = distance;
	}
	
	public GolfClub(String fileLine)
	{
		String[] splitLineParts = fileLine.split(":");
		this.name = splitLineParts[0];
		this.distance = Integer.parseInt(splitLineParts[1]);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getDistance()
	{
		return this.distance;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println("Distance: " + this.distance);
	}
}
