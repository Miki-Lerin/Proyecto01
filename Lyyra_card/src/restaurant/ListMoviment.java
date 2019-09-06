package restaurant;

public class ListMoviment {
	
	public static void listMoviment(MovimentDB db) {

		System.out.println("------MOVIMIENTOS DEL DIA--------------------------");
		
	    for (int i=0; i< db.arraySize(); i++) {
		      System.out.println(db.getPlate(i).getDate() + " " + i + " " + db.getPlate(i).getTipmov() + " " + db.getPlate(i).getConcep() + " " + db.getPlate(i).getDineroCaja());
	    }

	    System.out.println("---------------------------------------------------");
	}
}
