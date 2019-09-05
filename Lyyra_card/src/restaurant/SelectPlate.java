package restaurant;

import java.util.Date;
import java.util.Scanner;
import plate.*;
import java.text.DateFormat;

public class SelectPlate {

	// showMenu
	// _________________________________________________
	   public static double showMenu(Scanner reader, PlateDB db2, MovimentDB dbmov) {
		   
		    int ii = 0;
		    int optionend = 0;
		    double price = 0;
		   
		    System.out.println("*********************************************");
		    System.out.println(" P L A T O S  D E L  D I A                   ");
		    System.out.println("*********************************************");			   
 		    for(int i=0; i < db2.arraySize(); i++) {
 			   ii = i+1;
			   if (db2.getPlate(i).getPlate().length() >= 14) {
					System.out.println(ii + ".- " + db2.getPlate(i).getPlate() + "\t" + db2.getPlate(i).getPrice());					   
			   } else {
					System.out.println(ii + ".- " + db2.getPlate(i).getPlate() + "\t\t" + db2.getPlate(i).getPrice());				   
			   }
		    }
 		    
 		    optionend = ii + 1;
		    System.out.println("\n" + optionend + ".- Pagar");  
		    
			Date date = new Date();
	        DateFormat strdate = GetDateTime.getDateFormat();
		    
		    while (true) {
			    int option = inputplate(reader, db2, dbmov, optionend);
			    if (option == optionend) {
		        	System.out.println("Toca pagar " + "date: " + strdate.format(date));
		        	break;
			    } else {
			    	price = price + db2.getPlate(option - 1).getPrice();
			    }
		    }

		    System.out.println("Precio total es: " + price);
		    return price;
	   }
	   
		// input plate
		// _________________________________________________	   
	       public static Integer inputplate(Scanner reader, PlateDB db, MovimentDB dbMov, Integer pagar) {
	    	   
	           System.out.println("Seleccione plato");
	           int option = Integer.parseInt(reader.nextLine());

	           if (option == pagar) {
	        	   System.out.println("Toca pagar ");
	           } else {
		           System.out.println(db.getPlate(option - 1));	        	
	           }
	        
	           return option;
	       }
}