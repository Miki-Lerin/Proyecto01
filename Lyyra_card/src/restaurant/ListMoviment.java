package restaurant;

public class ListMoviment {
	
	public static void listMoviment(MovimentDB db) {

		double saldoCaja = 0;
		
		System.out.println("------MOVIMIENTOS DEL DIA--------------------------");
		
<<<<<<< HEAD
	    for(Moviment dbMoviment : db.getArray()) {
		      System.out.println(dbMoviment.getDate() + " " + dbMoviment.getNummov() + " " + dbMoviment.getTipmov() + " " + dbMoviment.getConcep() + " " + dbMoviment.getDineroCaja());

		      if (dbMoviment.getTipmov().contentEquals("R")) {
		    	  saldoCaja -= dbMoviment.getDineroCaja();
		      } else {
		    	  saldoCaja += dbMoviment.getDineroCaja();
		      }
		      
        }
=======
	    for (int i=0; i< db.arraySize(); i++) {
		      System.out.println(db.getPlate(i).getDate() + " " + i + " " + db.getPlate(i).getTipmov() + " " + db.getPlate(i).getConcep() + " " + db.getPlate(i).getDineroCaja());
	    }
>>>>>>> branch 'master' of https://github.com/Miki-Lerin/Proyecto01.git

	    System.out.println("El saldo de la caja es de: " + saldoCaja);
	    System.out.println("---------------------------------------------------");
	}
}
