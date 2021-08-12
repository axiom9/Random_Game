package cs201project;

import java.util.Random;
import java.util.Scanner;

public class gameclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Total number of rounds is 5.
		rules r = new rules();
		r.display();
		
		int totalpts= 0;
		int assignment1pts = 10;
		int task1pts = 10;
		int testpts = 0;
		
		System.out.println(" ");
		System.out.println("Please enter your first name");
		Scanner s = new Scanner(System.in);
		String firstname = s.nextLine();
		
		
		playerinfo Player = new playerinfo();
		Player.setfirstName(firstname);
	
		
		System.out.println(" ");
		System.out.println("Please enter your last name");
		Scanner s2 = new Scanner(System.in);
		String lastname = s.nextLine();
		
		
		
		Player.setLastname(lastname);
		
		
		System.out.println("Hey " + Player.getfirstName() +" "+ Player.getLastname() + " Welcome to the game, let's begin.");
		
		
		// WEEK 1 Start:
		System.out.println(" ");
		
		System.out.println("Please enter either 'A' for assignment or 'T' for task for week 1");
		Scanner s3 = new Scanner(System.in);
		String input = s3.nextLine();
		if(input.equalsIgnoreCase("A")) {
			// code for Assignment 1, week 1
			System.out.println("Okay, you chose an assignment, here is your first assignment: What color is the sky?");
			Scanner s4 = new Scanner(System.in);
			String i2 = s4.nextLine();
			if(i2.equalsIgnoreCase("blue")){
				System.out.println("You answered it right! You get 7 points.");
				totalpts += assignment1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, the sky is blue! You don't get any points. Your current points are "+ totalpts);
			}
		}
		else if (input.equalsIgnoreCase("T")) {
			// code for Task 1, week 1
			System.out.println("Okay, you chose a task, here is your first task: Sort these 5 integers in increasing order: 3, 5, 6, 2 ,1");
			Scanner s5 = new Scanner(System.in);
			String i3 = s5.nextLine();
			if(i3.equalsIgnoreCase("1 2 3 5 6") || i3.equalsIgnoreCase("12356")){
				System.out.println("You answered it right! You get 10 points.");
				totalpts += task1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, the answer is: 1 2 3 5 6! You don't get any points. Your current points are "+ totalpts);
			}
		
		}
		System.out.println(" ");
		Random rand2 = new Random();
		int randomNum2 = rand2.nextInt((10 - 1) + 1) + 1;
		//Random number less than 7 = random event.
		if(randomNum2 <= 7) {
			System.out.println("Oh no! You've encountered a random occurance that has hindered your progress!");
			Random_encounter randomencounter1 = new Random_encounter();
			randomencounter1.giveRandomEvent();
			testpts = randomencounter1.getRandomPoints();
			totalpts = (totalpts) + (testpts);
		}
	
		System.out.println("Your total points for week 1 are now: " + totalpts);
		// Week 1 DONE.
		
		
		//Week 2 Start:
		System.out.println(" ");
		
		System.out.println("Please enter either 'A' for assignment or 'T' for task for week 2");
		Scanner s5 = new Scanner(System.in);
		String i5 = s5.nextLine();
		if(i5.equalsIgnoreCase("A")) {
			// code for Assignment 2, week 2
			System.out.println("Okay, you chose an assignment, here is your second assignment: What's 10 x 10?");
			Scanner s6 = new Scanner(System.in);
			String i6 = s6.nextLine();
			if(i6.equalsIgnoreCase("100")){
				System.out.println("You answered it right! You get 15 points.");
				totalpts += assignment1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, 10 x 10 is 100! You don't get any points. Your current points are "+ totalpts);
			}
		}
		else if (i5.equalsIgnoreCase("T")) {
			// code for Task 2, week 2
			System.out.println("Okay, you chose a task, here is your second task: How many vowels are in the word 'Balloon'?");
			Scanner s7 = new Scanner(System.in);
			String i7 = s7.nextLine();
			if(i7.equalsIgnoreCase("3")){
				System.out.println("You answered it right! You get 12 points.");
				totalpts += task1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, the answer is: 3! You don't get any points. Your current points are "+ totalpts);
			}
		
		}
		System.out.println(" ");
		
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 
		//Random number less than 7 = random event.
		int randomNum = rand.nextInt((10 - 1) + 1) + 1;
		//Random number less than 7 = random event.
		if(randomNum <= 7) {
			System.out.println("Oh no! You've encountered a random occurance that has hindered your progress!");
			Random_encounter randomencounter2 = new Random_encounter();
			randomencounter2.giveRandomEvent();
			testpts = randomencounter2.getRandomPoints();
			totalpts = (totalpts) + (testpts);
		}
		
		
		System.out.println("Your total points for week 2 are now: " + totalpts);
		// Week 2 DONE
		
		// Week 3:
System.out.println(" ");
		
		System.out.println("Please enter either 'A' for assignment or 'T' for task for week 3");
		Scanner s8 = new Scanner(System.in);
		String i8 = s8.nextLine();
		if(i8.equalsIgnoreCase("A")) {
			// code for Assignment 3, week 3
			System.out.println("Okay, you chose an assignment, here is your third assignment: Let A = 1, and B = 2. What is 5a-2b+3");
			Scanner s9 = new Scanner(System.in);
			String i9 = s9.nextLine();
			if(i9.equalsIgnoreCase("7")){
				System.out.println("You answered it right! You get 20 points.");
				totalpts += assignment1pts;
				System.out.println(" ");
				System.out.println("Your total points are " + totalpts);
			}
			else {
				System.out.println("Wrong, it's 7! You don't get any points. Your current points are "+ totalpts);
			}
		}
		else if (i8.equalsIgnoreCase("T")) {
			// code for Task 3, week 3
			System.out.println("Okay, you chose a task, here is your third task: Please EXACTLY type the following (Case Sensitive! Watch out Professor, it consists of I's, L's, and 1's): II1li11I");
			Scanner s10 = new Scanner(System.in);
			String i10 = s10.nextLine();
			if(i10.equals("II1li11I")){
				System.out.println("You answered it right! You get 17 points.");
				totalpts += task1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, the answer is: II1li11I! You don't get any points. Your current points are "+ totalpts);
			}
		
		}
		System.out.println(" ");
		Random rand3 = new Random();
		int randomNum3 = rand3.nextInt((10 - 1) + 1) + 1;
		//Random number less than 7 = random event.
		if(randomNum3 <= 7) {
			System.out.println("Oh no! You've encountered a random occurance that has hindered your progress!");
			Random_encounter randomencounter3 = new Random_encounter();
			randomencounter3.giveRandomEvent();
			testpts = randomencounter3.getRandomPoints();
			totalpts = (totalpts) + (testpts);
		}
		
		System.out.println("Your total points for week 3 are now: " + totalpts);
		
		// Week 3 done!
		
		//Week 4:
System.out.println(" ");
		
		System.out.println("Please enter either 'A' for assignment or 'T' for task for week 3");
		Scanner s20 = new Scanner(System.in);
		String i20 = s20.nextLine();
		if(i20.equalsIgnoreCase("A")) {
			// code for Assignment 4, week 4
			System.out.println("Okay, you chose an assignment, here is your fourth assignment: What is the square root of negative one?");
			Scanner s21 = new Scanner(System.in);
			String i21 = s21.nextLine();
			if(i21.equalsIgnoreCase("i")){
				System.out.println("You answered it right! You get 26 points.");
				totalpts += assignment1pts;
				System.out.println(" ");
				System.out.println("Your total points are " + totalpts);
			}
			else {
				System.out.println("Wrong, it's 'i'! You don't get any points. Your current points are "+ totalpts);
			}
		}
		else if (i20.equalsIgnoreCase("T")) {
			// code for Task 3, week 3
			System.out.println("Okay, you chose a task, here is your fourth task: This one's easy! Please enter your name :)");
			Scanner s22 = new Scanner(System.in);
			String i22 = s22.nextLine();
			if(i22.equalsIgnoreCase(firstname)){
				System.out.println("You answered it right! You get 8 points.");
				totalpts += task1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, that isn't what you entered before. You don't get any points. Your current points are "+ totalpts);
			}
		
		}
		System.out.println(" ");
		Random rand4 = new Random();
		int randomNum4 = rand4.nextInt((10 - 1) + 1) + 1;
		//Random number less than 7 = random event.
		if(randomNum4 <= 7) {
			System.out.println("Oh no! You've encountered a random occurance that has hindered your progress!");
			Random_encounter randomencounter4 = new Random_encounter();
			randomencounter4.giveRandomEvent();
			testpts = randomencounter4.getRandomPoints();
			totalpts = (totalpts) + (testpts);
		}
		
		System.out.println("Your total points for week 4 are now: " + totalpts);
		// Week 4 - DONE!
		
		//week 5:
System.out.println(" ");
		
		System.out.println("Please enter either 'A' for assignment or 'T' for task for week 3");
		Scanner s30 = new Scanner(System.in);
		String i30 = s30.nextLine();
		if(i30.equalsIgnoreCase("A")) {
			// code for Assignment 5, week 5
			System.out.println("Okay, you chose an assignment, here is your fifth assignment: What is the neutral pH level?");
			Scanner s31 = new Scanner(System.in);
			String i31 = s31.nextLine();
			if(i31.equalsIgnoreCase("7")){
				System.out.println("You answered it right! You get 17 points.");
				totalpts += assignment1pts;
				System.out.println(" ");
				System.out.println("Your total points are " + totalpts);
			}
			else {
				System.out.println("Wrong, it's '7'! You don't get any points. Your current points are "+ totalpts);
			}
		}
		else if (i30.equalsIgnoreCase("T")) {
			// code for Task 5, week 5
			System.out.println("Okay, you chose a task, here is your fifth task: If you were to mix two colors to make orange, what colors will you mix?");
			Scanner s32 = new Scanner(System.in);
			String i32 = s32.nextLine();
			if(i32.equalsIgnoreCase("yellow and red") || i32.equalsIgnoreCase("yellow red") || i32.equalsIgnoreCase("red yellow") || i32.equalsIgnoreCase("red and yellow")){
				System.out.println("You answered it right! You get 13 points.");
				totalpts += task1pts;
				System.out.println(" ");
				System.out.println("Your total points are "+totalpts);
			}
			else {
				System.out.println("Wrong, you're supposed to mix red and yellow. You don't get any points. Your current points are "+ totalpts);
			}
		
		}
		System.out.println(" ");
		Random rand5 = new Random();
		int randomNum5 = rand5.nextInt((10 - 1) + 1) + 1;
		//Random number less than 7 = random event.
		if(randomNum4 <= 7) {
			System.out.println("Oh no! You've encountered a random occurance that has hindered your progress!");
			Random_encounter randomencounter5 = new Random_encounter();
			randomencounter5.giveRandomEvent();
			testpts = randomencounter5.getRandomPoints();
			totalpts = (totalpts) + (testpts);
		}		
		// Total points:
		System.out.println("Your total points for the entire semester are: " + totalpts);
		// A = 40 - 50 points
		// B = 30 - 40 points
		// C = 20 - 30 points
		// D = 10 - 20 points
		// Fail = anything below 10 points.
		if(totalpts >= 40) {
			System.out.println("You got an A congratulations!");
		}
		if(totalpts >= 30 && totalpts < 40) {
			System.out.println("You got an B! Almost there!");
		}
		if(totalpts >= 20 && totalpts < 30) {
			System.out.println("You got an C that's average, not bad!");
		}
		if(totalpts >= 10 && totalpts < 20) {
			System.out.println("You got an D, could've been worst!");
		}
		if(totalpts < 10) {
			System.out.println("You failed, please play the game again :)!");
		}

	}
	
	
	
	
	
	

}
