package person;

public class IsPersonInDB {
	
	   public static boolean isPersonInDB(Person person, PersonDB db) {
		   
	         // Check for empty array 
			 // _____________________________  
			    if (db.arraySize() == 0) {
			       System.out.println("No existe ninguna persona en el ArrayList");	
				   return true;
			    }
			    
			    for( Person dbPerson : db.getArray()) {
			      if (person.getFirstName().contentEquals(dbPerson.getFirstName()) &&
			      	  person.getLastName().contentEquals(dbPerson.getLastName()) &&
			      	  person.getDocumentDni().contentEquals(dbPerson.getDocumentDni())) {
					    return false;		    	  
			      }
	            }
			    
			    return true;
	   }
}
