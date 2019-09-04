package start;

import java.util.Scanner;

public class MenusOptionsStart {
	
//************************************************************
//*  TRATAMIENTO INICIAL                                     *
//************************************************************
	public static Integer initialMenuStart(Scanner reader) {

	    System.out.println("*********************************************");
	    System.out.println(" A P L I C A C I O N   G E N E R A L         ");
	    System.out.println("*********************************************");	    
        System.out.println("1. Tratamiento personas");
        System.out.println("2. Tratamiento tarjetas");
        System.out.println("3. Tratamiento platos");
        System.out.println("4. Tratamiento restaurante");
        System.out.println("99. Salir");
	            
        System.out.println("Escribe una de las opciones");

        int option = Integer.parseInt(reader.nextLine());
        
        return option;		
	}	
}
