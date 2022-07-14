/*
 * Chris Shaw
 * CS 143 Java 2 7/14/19
 *Player class to store points and run the methods of the dice program
 */
public class Player {
	//Field to store points
	private  int pointsRemaining;
	
	/**
	 * Constructor for Player class
	 * @param n sets n to be the amount of points remaining
	 */
	public Player(int n) {
	this.pointsRemaining = n;
	}
	
	/**
	 * getter for points remaining
	 * @return integer value of points remaining
	 */
	public  int getPointsRemaining() {
		return this.pointsRemaining;
	}
	
	/**
	 * setter for the total points
	 * @param n set to be points remaining
	 */
	public void setTotalPoints(int n) {
		this.pointsRemaining = n;
	}
	
	/**
	 * Simulates a full turn for each player
	 * Prints out info before, during, and after the roll
	 * if statement to check if points need to be added or subtracted based upon criteria set
	 */
	public void turn() {
		Die die = new Die(6);

		System.out.println("You have " + getPointsRemaining() + " points remaining.");
		die.roll();
		System.out.println("You rolled a " + die.getValue());
		if(this.getPointsRemaining()-die.getValue()>=1) {
		pointsRemaining -= die.getValue();
		} else {
			pointsRemaining+=die.getValue();
		}
		
		System.out.println("You now have " + getPointsRemaining() + " points remaining.");
		
	}
	/**
	 * method to see if point value meets criteria
	 * @return boolean value if criteria is met
	 */
	public Boolean isGameWon() {
		if( pointsRemaining == 1)return true;
		return false;
	}
	
	
}
