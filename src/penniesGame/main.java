package penniesGame;
import java.io.*;

public class main {

	public static void main(String args[]) throws IOException {
		String s = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Hello, whats your name?");
		s = br.readLine();
		System.out.println(("Hey " + s + ", it's nice to meet you!"));

	}

}
