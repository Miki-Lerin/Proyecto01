package card;

import java.util.Scanner;
import person.*;

public class InitialMenuCard {

	// _______________________________
	// Initial Menu Cards
	// _______________________________
	   public static void initialMenu(Scanner reader, CardDB db, PersonDB dbPersonDB) {
		   boolean salir = false;
		   
		   while(!salir){
			   
			   int option = MenusOptionsCard.initialMenu(reader);
	           
	           switch(option){
	             case 1:
				   CreateCard.createCard(reader, db, dbPersonDB);
	               break;
	             case 2:
	               DepositfromCard.depositfromCard(reader, db);
	               break;
	             case 3:
	               WithdrawalfromCard.withdrawalfromCard(reader, db);
	               break;
	             case 99:
	               salir=true;
	               break;
	             default:
	               System.out.println("Solo números entre 1 y 3");
	          }
			}  
	   }
}	   
