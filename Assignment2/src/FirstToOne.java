/*
 * Chris Shaw
 * CS 143 Java 2 7/14/19
 * Main Class for First to One Simulation
 * Takes user input then simulates a game of dice
 */


import java.util.ArrayList;
import java.util.Scanner;

public class FirstToOne {

	public static void main(String[] args) {
		
		//Boolean to signal end of game
		boolean won = false;
		//Scanner for system input
		Scanner entry = new Scanner(System.in);
		
		//Get number of players and number of points in the game
		System.out.println("Enter how many points you would like to start with");
		int startingPoints = entry.nextInt();
		System.out.println("Enter how many players are there?");		
		int totalPlayers = entry.nextInt();
		
		//Create a new ArrayList to store the players
		ArrayList<Player> players = new ArrayList<Player>();
		
		//loop to fill the ArrayList with the specified amount of players and specified points
		for(int i = 0; i< totalPlayers; i++) {
		players.add(new Player(startingPoints));
		}
		
		//While loop to simulate the game calling methods in Player class
		//tests if point value meet winning criteria
		
		while(!won) {
			
		for(int i =0; i< players.size(); i++) {
			System.out.println("Player " + (i+1) + "'s turn");
			players.get(i).turn();
			if(players.get(i).isGameWon()) {
				won=true;
				System.out.println("Player " + (i+1) + " Wins!");
				System.exit(0);
				entry.close();
			}
		}


		
		} 

	}


}
