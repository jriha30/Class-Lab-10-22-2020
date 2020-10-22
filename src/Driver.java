import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		GolfBag golfBag = new GolfBag("golfClubData.dat");
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("Please enter the distance you are looking for: ");
		String aDistanceString = scannerObj.nextLine();
		int aDistance = Integer.parseInt(aDistanceString);
		findClub(aDistance, golfBag);
	}
	
	public static void findClub(int aDistance, GolfBag golfBag)
	{
		ArrayList<GolfClub> golfClubs = golfBag.getBagOfClubs();
		GolfClub perfectClub = golfClubs.get(0);
		for(int i = 0; i < golfClubs.size(); i++)
		{
			if(aDistance >= golfClubs.get(i).getDistance())
			{
				perfectClub = golfClubs.get(i);
			}
		}
		perfectClub.display();
	}
}
