package start;

import java.util.Scanner;

import person.PersonDB;
import card.CardDB;
import plate.PlateDB;
import restaurant.MovimentDB;

public class MainStart {

	public static void main(String[] args) {

		System.out.println("Comenzamos!!!");
		
     // Ask user from menu by scanner
     // ______________________________________		      
        Scanner reader = new Scanner(System.in);
        
     // Ask user from DB's
     // ______________________________________
	    PersonDB dbPerson = new PersonDB("Person");
	    CardDB dbCard = new CardDB("Card");
	    PlateDB dbPlate = new PlateDB("Plate");
	    MovimentDB dbMoviment = new MovimentDB("Moviment");
		
		InitialMenuStart.initialMenuStart(reader, dbPerson, dbCard, dbPlate, dbMoviment);
		
		System.out.println("Finalizamos");

	}
}