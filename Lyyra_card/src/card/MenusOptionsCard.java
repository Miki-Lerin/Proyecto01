package card;

import java.util.Scanner;

public class MenusOptionsCard {
	
	//************************************************************
	//*  TRATAMIENTO PARA TARJETAS                               *
	//************************************************************	
	
	public static Integer initialMenu(Scanner reader) {
		
	    System.out.println("*********************************************");
	    System.out.println(" A P L I C A C I O N   T A R J E T A S       ");
	    System.out.println("*********************************************");	    
        System.out.println("1. Crear tarjeta");
        System.out.println("2. Recargar tarjeta");
        System.out.println("3. Pagar");
        System.out.println("99. Salir");
	            
        System.out.println("Escribe una de las opciones");
        
        int option = Integer.parseInt(reader.nextLine());
        
        return option;
	}
	
	public static String enternumcard(Scanner reader) {
		//   reader.nextLine();
		   
		   System.out.println("Entrar nº.tarjeta o quit para salir");
		   String asknumcard = reader.nextLine();
		   
		   return asknumcard;
   }
	
	
	public static String entercardholder(Scanner reader) {
		   System.out.println("Entrar el titular de la tarjeta");
		   String askowner = reader.nextLine();
		   
		   return askowner;
    }
	
	
	public static Double enteropeningbalance(Scanner reader) {
		   System.out.println("Entrar el saldo inicial");
		   double askbalance = Double.parseDouble(reader.nextLine());
		   
		   return askbalance;
	}
	
	
	public static Double balancetoenter(Scanner reader) {
		   System.out.println("Entrar el saldo a ingresar");
		   double askbalance = Double.parseDouble(reader.nextLine());
		   
		   return askbalance;
	}
	
	
	public static Double balancetowithdraw(Scanner reader) {
		   System.out.println("Entrar el saldo a retirar");
		   double askbalance = Double.parseDouble(reader.nextLine());
		   
		   return askbalance;
	}
	
	
	public static String accountfrom(Scanner reader) {
		//   reader.nextLine();
		   
		   System.out.println("Entrar nº.cuenta origen o quit para salir");
		   String askrootaccount = reader.nextLine();
		   
		   return askrootaccount;
	}
	
	
	public static String countup(Scanner reader) {
		   System.out.println("Entrar nº.cuenta destino");
		   String askdestinationaccount = reader.nextLine();
		   
		   return askdestinationaccount;
	}
	
	
	public static Double balancetotransfer(Scanner reader) {
		   System.out.println("Entrar el saldo a transferir");
		   double askbalancetotransfer = Double.parseDouble(reader.nextLine());
		
		   return askbalancetotransfer;
	}
}
