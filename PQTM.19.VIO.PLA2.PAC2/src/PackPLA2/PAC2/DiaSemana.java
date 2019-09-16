package PackPLA2.PAC2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DiaSemana {
	
	public static void main(String[] args) {
		 
		// Creamos una instancia del calendario
		Calendar now = Calendar.getInstance();
 
		System.out.println("Fecha actual : " + now.get(Calendar.DATE) 
						+ "-"
						+  (now.get(Calendar.MONTH) + 1)
						+ "-"
						+ now.get(Calendar.YEAR));
 
		// Array con los dias de la semana
		String[] strDays = new String[]{
						"Domingo",
						"Lunes",
						"Martes",
						"Miercoles",
						"Jueves",
						"Viernes",
						"Sabado"};
 
		// El dia de la semana inicia en el 1 mientras que el array empieza en el 0
		System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
		
		letraDia(24, 9, 2019);
		
		
	}
	
	public static void letraDia (int dia, int mes, int anyo) {
		
		String letraD="";
        /*Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia, 0, 0, 0);
        nD=c.get(Calendar.DAY_OF_WEEK);*/
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(anyo, mes-1, dia);
        int nD=calendar.get(Calendar.DAY_OF_WEEK);
  //      Log.i("result","diaSemana: "+nD+" dia:"+dia+" mes:"+mes+ "año:" + anyo);
        switch (nD){
            case 1: letraD = "Domingo";
                break;
            case 2: letraD = "Lunes";
                break;
            case 3: letraD = "Martes";
                break;
            case 4: letraD = "Miercoles";
                break;
            case 5: letraD = "Jueves";
                break;
            case 6: letraD = "Viernes";
                break;
            case 7: letraD = "Sabado";
                break;
        }
		
		System.out.println("Letra del dia semana: " + letraD);
		
	}
	
	
	
}
