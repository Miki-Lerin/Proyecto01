package plate;

import java.util.Scanner;

import plate.PlateDB;

public class StartPlate {

	// startPlate
	// _________________________________________________
	   public static PlateDB startPlate(Scanner reader, PlateDB db) {
		      
              InitialMenuPlate.initialMenuPlate(reader, db);
	   		 
		      System.out.println("The End startPlate !!!");
		      
		      return db;
	}
}