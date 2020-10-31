package penniesGame;
import java.io.*;

public class main {

	public static String getPlayerInfo() throws IOException {
		String playerName = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Welcome to Pennies. A simple text game where the aim is to not remove the last pennie in the stack.");
		System.out.println("To start with, what is your name?");
		playerName = br.readLine();
		
		System.out.println(("Hey " + playerName + ", it's nice to meet you!"));
		
		return playerName;
	}

	
	public static void main(String args[]) throws IOException {
		String playerName = null;
		char playerChoice = 'x';
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);		
		
		playerName = getPlayerInfo();
		
		System.out.println("Would you like to make the first move? (y/n)");
		playerChoice = (char) br.read();		
		

	}
}
