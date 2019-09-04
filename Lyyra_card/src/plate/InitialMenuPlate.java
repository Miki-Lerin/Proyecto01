package plate;

import java.util.Scanner;

public class InitialMenuPlate {

		// _______________________________
		// Initial Menu Plates
		// _______________________________
		   public static void initialMenuPlate(Scanner reader, PlateDB db) {
			   boolean salir = false;
			   
			   while(!salir){
				   
				   int option = MenusOptionsPlate.initialMenuPlate(reader);
		           
		           switch(option){
		             case 1:
		               CreatePlate.createPlate(reader, db);
		               
		               for (int i=0; i<db.arraySize(); i++) {
		            	   System.out.println(db.getPlate(i));
		               }

		               break;
		             case 2:
		               RemovePlate.removePlat(reader, db);
		               
		               
		               for (int i=0; i<db.arraySize(); i++) {
		            	   System.out.println(db.getPlate(i));
		               }
		               
		               break;
		             case 3:
		               ChangePlatePrice.changeplateprice(reader, db);
		               
		               for (int i=0; i<db.arraySize(); i++) {
		            	   System.out.println(db.getPlate(i));
		               }
		              
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