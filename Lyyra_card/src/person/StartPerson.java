package person;

import java.util.Scanner;

public class StartPerson {

	// startPerson
	// _________________________________________________
	   public static PersonDB startPerson(Scanner reader, PersonDB db) {
		      
		      InitialMenuPerson.initialMenuPerson(reader, db);
	   		 
		      System.out.println("The End startPerson !!!");
		      
		      return db;
	}
}
