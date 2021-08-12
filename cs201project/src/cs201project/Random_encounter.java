package cs201project;

import java.util.Random;
import java.util.Scanner;

public class Random_encounter{

	int randomPoints = 0;
	
	int totalRandomPoints = 0;
	 
	
	public int getRandomPoints() {
		return randomPoints;
	}




	public void setRandomPoints(int randomPoints) {
		this.randomPoints = randomPoints;
	}




	public int getTotalRandomPoints() {
		return totalRandomPoints;
	}




	public void setTotalRandomPoints(int totalRandomPoints) {
		this.totalRandomPoints = totalRandomPoints;
	}




	public static int randomRange (int min, int max)
	{
		
		if (min>= max)
			
			throw new IllegalArgumentException ("max needs to be larger than min");


	   Random rand = new Random();

	   
	   return rand.nextInt((max-min) + 1) + min;
	   
	}
	
	

	
public int giveRandomEvent ()


{
	int x = randomRange(25,32);



	
	if (x > 32 || x < 25)
		
	{
	
		System.out.println("Integer is not within range");
		
		
	}
	
	else if (x ==25)
		
	{
		
		System.out.println(" Your mom is calling! Are you going to pick up? Y or N. ");
		
		{
			Scanner scan = new Scanner(System.in);
			String key = scan.nextLine();
			if (key.equals("Y") || key.equals("y"))
				
			{
				
				System.out.println("Oh no! She talked for an hour to complain and it stressed you out!");
				
				randomPoints = 0;
				
				randomPoints += totalRandomPoints;
				
			}
			
			if (key.equals("N") || key.equals("n"))
				
			{
				
				System.out.println(" Great! You had some extra time to take a nap");
				
				randomPoints = 4;
				
				randomPoints += totalRandomPoints;

				
			}
			
			
			
			
		}
		
		
	}
	

	else if (x ==26)
		
	{
		
		System.out.println("Your friend invited you to a party. Are you going? Enter Y or N. ");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("You had an awesome time and you blew off some steam!");
			
			randomPoints = 2;
			
			randomPoints += totalRandomPoints;

			
		}
		
		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println("You studied instead and now feel super burned out! Bummer.");
			
			randomPoints = -2;
			randomPoints += totalRandomPoints;

		}
		
		
	}
	
	else if (x ==27)
		
	{
		
		System.out.println("Your professor just annouced an optional assignemnt! Are you going to do it? Y or N.");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("Awesome! You got full credit! :) ");
			
			randomPoints = 3;
			
			randomPoints += totalRandomPoints;

			
		}
		
		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println("Bummer you should've the optional assignment!");
			
			randomPoints = 0;
			randomPoints += totalRandomPoints;

			
		}
		
		
	}
	
	else if (x ==28)
		
	{
		
		System.out.println("Your friends needs help moving stuff into their dorm. Are you going to help? Y or N.");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("Oh snap! You injured your back moving a couch! Now you missed a day of class!");
			
			randomPoints = -5;
			
			randomPoints += totalRandomPoints;

		}
		
		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println("Your friend is mad but at least you got to catch up on homework instead!");
			
			randomPoints = 1;
			randomPoints += totalRandomPoints;

		}
		
		
	}
	
	else if (x ==29)
		
	{
		
		System.out.println("Your friend brought you a chili cheese dog! Will you accept it? Y or N.");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("Bummer you got SUPER sick! You've been throwing up all day! :( ");
			
			randomPoints = -3;
			
			randomPoints += totalRandomPoints;

			
		}
		
		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println("Cool you ate a salad instead (with extra avocado) and now you have more brain power!");
			
			randomPoints = 3;
			
			randomPoints += totalRandomPoints;

			
		}
		
		
	}
	
	
	else if (x ==30)
		
	{
		
		System.out.println(" Oh snap! Your toliet's overflowing! Are you going to call a plummer? Y or N.");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("Great! Your toilet was fixed, but the pipes burst! The whole apartment flooded!");
			
			randomPoints = -10;
			
			randomPoints += totalRandomPoints;

			
		}
		
		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println("That's ok. You stayed at the library instead and did your business there. It's been uncomfortable sleeping under the desk though :( ");
			
			randomPoints = -3;
			
		}
		
		
	}
	
	else if (x ==31)
		
	{
		
		System.out.println("Your roommate asked if you wanted to volunteer this weeked at the soup kitchen! Will you volunteer? Y or N.");
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		if (key.equals("Y") || key.equals("y"))
			
		{
			
			System.out.println("You're a thoughtful and caring person! :) ");
			
			randomPoints = 5;
			
			randomPoints += totalRandomPoints;

			
		}

		if (key.equals("N") || key.equals("n"))
			
		{
			
			System.out.println(" What a grinch! ");
			
			randomPoints = 0;
			randomPoints += totalRandomPoints;

		}
		
		
	}
	
	
	else if (x ==32)
	
{
	
	System.out.println("You meet someone you really liked and they asked you to go on a date! Are you going? Y or N.");
	Scanner scan = new Scanner(System.in);
	String key = scan.nextLine();
	if (key.equals("Y") || key.equals("y"))
		
	{
		
		System.out.println("It lifts your spirits! This could be the love of your life! :) ");
		
		randomPoints = 5;
		
		randomPoints += totalRandomPoints;

		
	}
	
	if (key.equals("N") || key.equals("n"))
		
	{
		
		System.out.println(" What a missed opporunity! You'll spend your life wondering What if? ");
		
		randomPoints = 0;
		randomPoints += totalRandomPoints;

	}
	
	
}

	else
		
	
	return 0;
	return totalRandomPoints;
	
}

	
	
	
public  String toString()

{
	
	
	return "" + randomPoints + "" + totalRandomPoints;

			
}
	
	
	
	}

