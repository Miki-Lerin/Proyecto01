package PackPLA2.PAC2;

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
   
        return true;
    }
	
	public static boolean fechaMayorFechaInicial(Date fechaHasta) {
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		try {
			Date fechaDesde = df.parse("01011978");
			int resultComparacion = fechaDesde.compareTo(fechaHasta);
			if (resultComparacion > 0) {
				return false;
			}
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static int numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {
	     long startTime = fecha1.getTime();
	     long endTime = fecha2.getTime();
	     long diffTime = endTime - startTime;
	     int totalDias = (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	     return (totalDias + 1);
	}
}
