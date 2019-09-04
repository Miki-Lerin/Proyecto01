package person;

import java.util.Scanner;

public class MenusOptionsPerson {
	
//************************************************************
//*  TRATAMIENTO PARA PERSONAS                               *
//************************************************************
	public static Integer initialMenuPerson(Scanner reader) {
	    
	    System.out.println("*********************************************");
	    System.out.println(" A P L I C A C I O N   P E R S O N A S       ");
	    System.out.println("*********************************************");	    
        System.out.println("1. Añadir persona");
        System.out.println("99. Salir");
	            
        System.out.println("Escribe una de las opciones");
 
        int option = Integer.parseInt(reader.nextLine());
        
        return option;		
	}	
	
	public static String enterfirstname(Scanner reader) {
		  // reader.nextLine();
		   
		   System.out.println("Entrar firstname o quit para salir");
		   String askfirstname = reader.nextLine();
		   
		   return askfirstname;
	}	
	
	
	public static String enterlastname(Scanner reader) {
		   System.out.println("Entrar lastname");
		   String asklastname = reader.nextLine();
		   
		   return asklastname;
	}
	
	
	public static String entersex(Scanner reader) {
		   System.out.println("Entrar sexo");
		   String asksex = reader.nextLine();
		   
		   return asksex;
	}	
	
	
	public static String enterdocumentDni(Scanner reader) {
		   System.out.println("Entrar dni");
		   String askdocumentDni = reader.nextLine();
		   
		   return askdocumentDni;
	}
}
