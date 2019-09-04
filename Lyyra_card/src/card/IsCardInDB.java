package card;

public class IsCardInDB {
	
	   public static boolean isCardInDB(Card card, CardDB db) {
		   
	         // Check for empty array 
			 // _____________________________  
			    if (db.arraySize() == 0) {
			       System.out.println("No existe ninguna tarjeta en el ArrayList");	
				   return true;
			    }
			    
			    for( Card dbCard : db.getArray()) {
			      if (card.getNumcard().equals(dbCard.getNumcard())) {
					    return false;		    	  
			      }
	            }
			    
			    return true;
	   }
	   
	   
	   public static boolean isCardInDb(String card, CardDB db) {
	 	   for (int i=0; i < db.arraySize(); i++) {
		 		  
 		   if (db.getCard(i).getNumcard().contentEquals(card)) {
 			   return true;
	 		  }
		   }		
  
		   return false;
	   }
	   
	   
}
