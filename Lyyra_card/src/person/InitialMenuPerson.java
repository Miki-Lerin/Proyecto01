package person;

import java.util.Scanner;

public class InitialMenuPerson {

		// _______________________________
		// Initial Menu Persons
		// _______________________________
		   public static void initialMenuPerson(Scanner reader, PersonDB db) {
			   boolean salir = false;
			   
			   while(!salir){
				   
				   int option = MenusOptionsPerson.initialMenuPerson(reader);
		           
		           switch(option){
		             case 1:
		               CreatePerson.createPerson(reader, db);
		               
		               for (int i=0; i<db.arraySize(); i++) {
		            	   System.out.println(db.getPerson(i).getFirstName());
		               }

		               break;
		             case 99:
		               salir=true;
		               break;
		             default:
		               System.out.println("Solo números entre 1 y 1");
		          }
				}  
		   }	   
}	   