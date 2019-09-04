package card;

import person.PersonDB;

public class ValidateOwner {
	
	public static Boolean validateOwner(String askowner, PersonDB db) {
		
		   for(int i=0; i < db.arraySize(); i++) {
			   if (db.getPerson(i).getFirstName().contentEquals(askowner)) {
				   return true;
		       }
		   }
				   
		   return false;
	}
}
