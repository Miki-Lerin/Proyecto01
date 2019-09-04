package restaurant;

import java.util.Scanner;

import plate.PlateDB;

public class InitialMenuRestaurant {

		// _______________________________
		// Initial Menu Restaurant
		// _______________________________
		   public static void initialMenuRestaurant(Scanner reader, PlateDB dbplate, MovimentDB dbmov) {
			   boolean salir = false;
			   
			   while(!salir){
				   
				   int option = MenusOptionsRestaurant.initialMenuStart(reader);
		           
		           switch(option){
		             case 1:
		            	 double beginningBalance = OpenBox.openBox(reader);
		         		 System.out.println("Caja abierta con " + beginningBalance + " €");
		         		 WriteMoviment.writeMoviment(1, "A", "Apertura caja", beginningBalance, 0.0, dbmov);
		               break;
		             case 2:
		            	 SelectPlate.showMenu(reader, dbplate, dbmov);
		               break;
		             case 3:
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