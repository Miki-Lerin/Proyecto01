package card;

import java.util.Scanner;
import person.PersonDB;

public class CreateCard {
	
	   public static void createCard(Scanner reader, CardDB db, PersonDB dbPersonDB) {
		   
		   while (true) {
			   String asknumcard = MenusOptionsCard.enternumcard(reader);
			   
			   if (asknumcard.contentEquals("quit")) {
	     		   break;
			   }

			   String askowner = MenusOptionsCard.entercardholder(reader);
			   
			   Boolean existPerson = ValidateOwner.validateOwner(askowner, dbPersonDB);
			   
			   if (!existPerson) {
				   System.out.println("No existe persona. Fallo referencial. Sigue proceso como INVITADO");
				   askowner = "INVITADO(" + askowner + ")";
			   }
				   
		       Double askbalance = MenusOptionsCard.enteropeningbalance(reader); 
               
            // Create object Cash
		    // _____________________
			   Card card = new Card(asknumcard, askowner, askbalance);
			   
			   
	 	    // Ask if card is in CardDB
		    // _______________________________
			   if (IsCardInDB.isCardInDB(card, db)) {
				   db.addCard(card);
				   System.out.println("Se ha añadido la tarjeta " + card);
			   } else {
				   System.out.println("Ya existe la tarjeta en la matriz");
			   }
		   }
	   }
}
