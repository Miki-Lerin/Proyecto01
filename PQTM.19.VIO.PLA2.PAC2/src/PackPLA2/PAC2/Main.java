package PackPLA2.PAC2;

// import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader);
		menu.loop(reader);
		
		System.out.println("End of the date test!");
	}
}
