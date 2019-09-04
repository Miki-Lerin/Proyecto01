package plate;

import java.util.Scanner;

public class MenusOptionsPlate {
	
//************************************************************
//*  TRATAMIENTO PARA PLATOS                                 *
//************************************************************
	public static Integer initialMenuPlate(Scanner reader) {

	    System.out.println("*********************************************");
	    System.out.println(" A P L I C A C I O N   P L A T O S           ");
	    System.out.println("*********************************************");	    
        System.out.println("1. Añadir plato");
        System.out.println("2. Quitar plato");
        System.out.println("3. Cambiar precio");
        System.out.println("99. Salir");
	            
        System.out.println("Escribe una de las opciones");
         int option = Integer.parseInt(reader.nextLine());
        
        return option;		
	}	
	
	public static String enterplate(Scanner reader) {
	//	   reader.nextLine();
		   
		   System.out.println("Entrar plato o quit para salir");
		   String askplate = reader.nextLine();
		   
		   return askplate;
	}	
	
	
	public static String enterplatetoremove(Scanner reader) {
		//   reader.nextLine();
		   
		   System.out.println("Entrar plato a quitar o quit para salir");
		   String askplate = reader.nextLine();
		   
		   return askplate;
	}	
	
	public static Double enterplateprice(Scanner reader) {
		   System.out.println("Entrar el precio del plato");
		   double askprice = Double.parseDouble(reader.nextLine());
		   
		   return askprice;
	}	
}
