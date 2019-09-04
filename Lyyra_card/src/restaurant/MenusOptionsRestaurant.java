package restaurant;

import java.util.Scanner;

public class MenusOptionsRestaurant {
	
//************************************************************
//*  TRATAMIENTO INICIAL                                     *
//************************************************************
	public static Integer initialMenuStart(Scanner reader) {

	    System.out.println("*********************************************");
	    System.out.println(" A P L I C A C I O N   R E S T A U R A N T   ");
	    System.out.println("*********************************************");	    
        System.out.println("1. Abrir caja");
        System.out.println("2. Elegir platos");
        System.out.println("3. Caja");
        System.out.println("4. Cerrar caja");
        System.out.println("99. Salir");
	            
        System.out.println("Escribe una de las opciones");

        int option = Integer.parseInt(reader.nextLine());
        
        return option;		
	}	
}
