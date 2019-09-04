package restaurant;

import java.text.DateFormat;
import java.util.Date;

public class WriteMoviment {
	
	public static void writeMoviment(int nummov, String tipMov, String concep, double price) {
		
		Date date = new Date();
        DateFormat datehour = GetDateTime.getDateFormat();
	
        System.out.println("WirteMoviment " + datehour);
        
 		Moviment M1 = new Moviment(datehour, nummov, tipMov, concep, price);
		
		
		
		
	}

}
