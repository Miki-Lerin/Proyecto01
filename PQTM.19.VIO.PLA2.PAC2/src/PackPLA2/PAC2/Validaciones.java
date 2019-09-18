package PackPLA2.PAC2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Validaciones {
	
	public static boolean fechaEsValida(String fecha) {
        try {
          SimpleDateFormat formatoFecha = new SimpleDateFormat("ddMMyyyy", Locale.getDefault());
          formatoFecha.setLenient(false);
          formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
   
        return fechaMayorFechaInicial(fecha);
      //  return true;
    }
	
	public static boolean fechaMayorFechaInicial(String fecha) {
		
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		Date fechaDesde = new Date();
		Date fechaHasta = new Date();
		
		try {
			fechaDesde = df.parse("01011978");
			fechaHasta = df.parse(fecha);
			System.out.println("Fecha desde " + df.format(fechaDesde));
			System.out.println("Fecha Hasta " + df.format(fechaHasta));
			int resultComparacion = fechaDesde.compareTo(fechaHasta);
			if (resultComparacion >= 0) {
				return false;
			}
		} catch (ParseException e) {
			return false;
		}

		numeroDiasEntreDosFechas(fechaDesde, fechaHasta);
		
		desglosarFechaHasta(fecha);
		
		return true;
	}
	
	public static void numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {
	     long startTime = fecha1.getTime();
	     long endTime = fecha2.getTime();
	     long diffTime = endTime - startTime;
	     int totalDias = (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	     System.out.println("Dias de diferencia: " + (totalDias + 1));
	}
	
	public static void desglosarFechaHasta(String fecha) {
		  int diaint = Integer.parseInt(fecha.substring(0, 2)); 
		  int mesint = Integer.parseInt(fecha.substring(2, 4));
		  int anyoint = Integer.parseInt(fecha.substring(4, 8));		
		
		  System.out.println("La fecha " + fecha + " es " +
			DiaSemana.diaDeLaSemana(diaint, mesint, anyoint));
	}
}
