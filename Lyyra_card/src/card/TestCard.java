package card;

import java.util.Scanner;

import person.PersonDB;


public class TestCard {

	// Metodo main
	// _________________________________________________
	   public static void main(String[] args) {
	
		   // Create db for Cash
		   // ______________________________________
		      CardDB db = new CardDB("Cash");
			  PersonDB dbPerson = new PersonDB("Person");
	
	      
		   // Ask user from menu by scanner
		   // ______________________________________		      
		      Scanner reader = new Scanner(System.in);
	   		 
		      InitialMenuCard.initialMenu(reader, db, dbPerson);

		      System.out.println("The End !!!");
	}
}
