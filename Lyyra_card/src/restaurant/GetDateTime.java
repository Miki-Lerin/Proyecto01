package restaurant;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GetDateTime {
	
	public static DateFormat main(String[] args) {
		Date date = new Date();
		
//		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
//		System.out.println("Hora: "+hourFormat.format(date));
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		System.out.println("Fecha: "+dateFormat.format(date));
		
 		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss yyyyMMdd");
 		System.out.println("Hora y fecha: "+hourdateFormat.format(date));
		
		return hourdateFormat;
	}
}
