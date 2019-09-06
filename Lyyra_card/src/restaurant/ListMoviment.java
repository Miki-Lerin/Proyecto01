package restaurant;

public class ListMoviment {
	
	public static void listMoviment(MovimentDB db) {

		System.out.println("------MOVIMIENTOS DEL DIA--------------------------");
		
	    for(Moviment dbMoviment : db.getArray()) {
		      System.out.println(dbMoviment.getDate() + " " + " " + dbMoviment.getTipmov() + " " + dbMoviment.getConcep() + " " + dbMoviment.getDineroCaja());
        }

	    System.out.println("---------------------------------------------------");
	}
}
