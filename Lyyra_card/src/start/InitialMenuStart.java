package start;

import java.util.Scanner;
import person.*;
import card.*;
import plate.*;
import restaurant.*;

public class InitialMenuStart {

		// _______________________________
		// Initial Menu Persons
		// _______________________________
		   public static void initialMenuStart(Scanner reader, PersonDB myPersonGen, 
				   							   CardDB myCardGen, PlateDB myPlateGen, MovimentDB myMovimentGen) {
			   boolean salir = false;
			   
			   while(!salir){
				   
				   int option = MenusOptionsStart.initialMenuStart(reader);
		           
		           switch(option){
		             case 1:
		               PersonDB myPerson = person.StartPerson.startPerson(reader, myPersonGen);
		               myPersonGen = myPerson;
		               break;
		             case 2:
              	       CardDB myCard = card.StartCard.startCard(reader, myCardGen, myPersonGen);
		               myCardGen = myCard;
		               break;
		             case 3:
		               PlateDB myPlate = plate.StartPlate.startPlate(reader, myPlateGen);
		               myPlateGen = myPlate;
		               break;
		             case 4:
		               restaurant.StartRestaurant.startMoviment(reader, myPlateGen, myMovimentGen);
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