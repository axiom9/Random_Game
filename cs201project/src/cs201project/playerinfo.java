package cs201project;

public class playerinfo {

	String firstName; //Purpose of the firstName attribute will be to personalize the game.
	
	String lastName; //Purpose of the lastName attribute will be to personalize the game
	
	int difficultyLevel; //Will have a value of either 0 or 1
	
	
	public String getfirstName(){ //Accessor method for firstName
		return firstName;
		}

	public String getLastname(){ //Accessor method for lastName
		return lastName;
		}

	public int getdifficultyLevel(){ //Accessor method for difficultyLevel
		return difficultyLevel;
		}

	public void setfirstName (String firstName){ //mutator method for firstName
		this.firstName = firstName;
		}

	public void setLastname(String lastName){ //Mutator method for lastName
		this.lastName = lastName;
		}
	
	public void setdifficultyLevel(int difficultyLevel){ //Mutator method for difficultyLevel
		this.difficultyLevel = difficultyLevel;
		}
	
	


}
