package person;

import java.util.Scanner;

public class CreatePerson {
	
	   public static void createPerson(Scanner reader, PersonDB db) {
		   
		   while (true) {
			   String askfirstname = MenusOptionsPerson.enterfirstname(reader);
			   
			   if (askfirstname.contentEquals("quit")) {
	     		   break;
			   }
			   
			   String asklastname = MenusOptionsPerson.enterlastname(reader);

			   String asksex = MenusOptionsPerson.entersex(reader);
			   
			   String askdocumentDni = MenusOptionsPerson.enterdocumentDni(reader);
		   
	 	    // Create object Person
		    // _____________________
			   Person person = new Person(askfirstname, asklastname, asksex, askdocumentDni);
			   
	 	    // Ask if person is in PersonDB
		    // _______________________________
			   if (IsPersonInDB.isPersonInDB(person, db)) {
				   db.addPerson(person);
				   System.out.println("Se ha añadido la persona " + person.getFirstName() +
						   " " + person.getLastName() + " " + person.getSex() + " " + person.getDocumentDni());
			   } else {
				   System.out.println("Ya existe la persona en la matriz");
			   }
		   }
	    
	   }
}