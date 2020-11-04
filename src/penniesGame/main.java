package penniesGame;
import java.io.*;

public class main {

	public static String getPlayerInfo() throws IOException {
		String playerName = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Welcome to Pennies. A simple text game where the aim is to not remove the last penny in the stack.");
		System.out.println("To start with, what is your name?");
		playerName = br.readLine();
		
		System.out.println(("Hey " + playerName + ", it's nice to meet you!"));
		
		return playerName;
	}
	
	public static char getPlayerChoice() throws IOException {
		char playerChoice = 'x';
		char turn = 'x';
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Would you like to make the first move? (y/n)");
		playerChoice = (char) br.read();		
		
		if(playerChoice == 'y') {
			turn = 'p';
		} else if(playerChoice == 'n') {
			turn = 'c';
		} else {
			turn = 'x';
			System.out.println("Invalid choice. Please enter either y for Yes or n for No.");
		}
		
		return turn;		
	}
	
	public static void drawPennies(int numOfPennies) {
		for(int i = numOfPennies; i > 0; i--) {
			System.out.print("o");
		}
	}

	
	public static void main(String[] args) throws IOException {
		String playerName = null;
		char turn = 'x';
		int numOfPennies = 21;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);		
		
		playerName = getPlayerInfo();
		turn = getPlayerChoice();
		drawPennies(numOfPennies);


	}
}