package restaurant;

import java.util.Scanner;

import plate.PlateDB;

public class InitialMenuRestaurant {

		// _______________________________
		// Initial Menu Restaurant
		// _______________________________
		   public static void initialMenuRestaurant(Scanner reader, PlateDB dbplate, MovimentDB dbmov) {
			   boolean salir = false;
			   double price = 0;
			   double saldoCaja = 0;
			   
			   while(!salir){
				   
				   int option = MenusOptionsRestaurant.initialMenuStart(reader);
		           
		           switch(option){
		             case 1:
		            	 double beginningBalance = OpenBox.openBox(reader);
		         		 System.out.println("Caja abierta con " + beginningBalance + " €");
		         		 WriteMoviment.writeMoviment(1, "A", "Apertura caja", beginningBalance,  0.0, dbmov);
		         		 saldoCaja += beginningBalance;
		               break;
		             case 2:
		            	 price = SelectPlate.showMenu(reader, dbplate, dbmov);
		            	 WriteMoviment.writeMoviment(2, "C", "Cobro platos", price, 0.0, dbmov);
		               break;
		             case 3:
		            	 saldoCaja = CobroCaja.cobroCaja(reader, saldoCaja, price, dbmov);
		               break;
		             case 4:
		            	ListMoviment.listMoviment(dbmov);
		             	System.out.println("\n Saldo actual caja: " + saldoCaja);
		             	break;
		             case 99:
		               salir=true;
		               break;
		             default:
		               System.out.println("Solo números entre 1 y 4");
		          }
				}  
		   }	   
}	   