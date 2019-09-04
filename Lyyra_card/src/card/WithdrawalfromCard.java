package card;

import java.util.Scanner;

public class WithdrawalfromCard {
	
	
	// _______________________________
	// withdrawal from Card
	// _______________________________	   
	   public static void withdrawalfromCard(Scanner reader, CardDB db) {
		   
		   while (true) {
			   String asknumcard = MenusOptionsCard.enternumcard(reader);
			   
			   if (asknumcard.contentEquals("quit")) {
	     		   break;
			   }
			   
			   if (!IsCardInDB.isCardInDb(asknumcard, db)) {
				   System.out.println("No existe la tarjeta " + asknumcard);
				   System.out.println("Vuelva a entrar el nº. de tarjeta");
	//			   System.out.println("Pulse INRO");
			   } else {
				   Double askbalance = MenusOptionsCard.balancetowithdraw(reader);
				   
			 	    // Trabajar con cuenta a ingresar
				    // _______________________________
				 	   for (int i=0; i < db.arraySize(); i++) {
				 		  
				 		   if (db.getCard(i).getNumcard().contentEquals(asknumcard)) {
					 			  Card mycard = db.getCard(i);
					 			  mycard.withdrawals(askbalance);
					 			  db.getCard(i).setBalance(mycard.getBalance());
					 			  break;
					 		  }
					   }				   
			   }
		   }

		   System.out.println("Retirada --> La matriz contiene --> " + db.getArray());

	   }		
}
