package restaurant;

import java.text.DateFormat;
import java.util.Date;

public class WriteMoviment {
	
	public static void writeMoviment(int nummov, String tipMov, String concep, double moneyEntry, double moneyChange, MovimentDB db) {
		
		Date date = new Date();
        DateFormat datehour = GetDateTime.getDateFormat();
	
        System.out.println("WirteMoviment " + datehour.format(date));
        Moviment M1 = new Moviment(datehour.format(date), nummov, tipMov, concep, moneyEntry);        	
 		
		db.addMoviment(M1);
		
		System.out.println("WriteMoviment --> " + M1.getDate() + " Saldo Caja: " + M1.getDineroCaja());
	}

}
