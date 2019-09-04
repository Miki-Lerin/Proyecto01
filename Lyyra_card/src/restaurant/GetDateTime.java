package restaurant;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GetDateTime {
	
	public static DateFormat getDateFormat() {
		Date date = new Date();
		
//		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
//		System.out.println("Hora: "+hourFormat.format(date));
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		System.out.println("Fecha: "+dateFormat.format(date));
		
 		DateFormat datehourFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
 		
 		System.out.println("getDateFormat --> Fecha y hora: "+ datehourFormat.format(date));
		
 		return datehourFormat;
	}
}
