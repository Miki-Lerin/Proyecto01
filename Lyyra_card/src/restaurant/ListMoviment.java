package restaurant;

public class ListMoviment {
	
	public static void listMoviment(MovimentDB db) {

		double saldoCaja = 0;
		
		System.out.println("------MOVIMIENTOS DEL DIA--------------------------");
		
	    for(Moviment dbMoviment : db.getArray()) {
		      System.out.println(dbMoviment.getDate() + " " + dbMoviment.getNummov() + " " + dbMoviment.getTipmov() + " " + dbMoviment.getConcep() + " " + dbMoviment.getDineroCaja());

		      if (dbMoviment.getTipmov().contentEquals("R")) {
		    	  saldoCaja -= dbMoviment.getDineroCaja();
		      } else {
		    	  saldoCaja += dbMoviment.getDineroCaja();
		      }
		      
        }

	    System.out.println("El saldo de la caja es de: " + saldoCaja);
	    System.out.println("---------------------------------------------------");
	}
}
