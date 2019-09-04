package person;

import java.util.Scanner;

public class TestPerson {

	// Metodo main
	// _________________________________________________
	   public static void main(String[] args) {
	
		   // Create db for Person
		   // ______________________________________
		      PersonDB db = new PersonDB("Person");
		      
		   // Ask user from menu by scanner
		   // ______________________________________		      
		      Scanner reader = new Scanner(System.in);
		      
		      InitialMenuPerson.initialMenuPerson(reader, db);
	   		 
		      System.out.println("The End !!!");
		      
	}
}
