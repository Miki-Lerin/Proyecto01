package restaurant;

import java.util.Scanner;

import plate.PlateDB;

public class StartRestaurant {

	// startPlate
	// _________________________________________________
	   public static MovimentDB startMoviment(Scanner reader, PlateDB dbPlate, MovimentDB dbMov) {
		   
		      InitialMenuRestaurant.initialMenuRestaurant(reader, dbPlate, dbMov);
	   		 
		      System.out.println("The End startPlate !!!");
		      
		      return dbMov;
	}
}