package card;

import java.util.Scanner;
import person.*;

public class StartCard {

	// startCard
	// _________________________________________________
	   public static CardDB startCard(Scanner reader, CardDB db, PersonDB dbPersonDB) {
	
		      InitialMenuCard.initialMenu(reader, db, dbPersonDB);

		      System.out.println("The End startCard !!!");
		      
		      return db;
	}
}
