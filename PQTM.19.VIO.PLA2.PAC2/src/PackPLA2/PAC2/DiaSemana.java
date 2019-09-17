package PackPLA2.PAC2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DiaSemana {
	
/*	public static void main(String[] args) {
		 
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
		
		diaDeLaSemana(24, 9, 2019);
		
		
	}
	
	*/
	
	public static String diaDeLaSemana (int dia, int mes, int anyo) {
		
		String diaSemana ="";
 
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(anyo, mes-1, dia);
        int numDia = calendar.get(Calendar.DAY_OF_WEEK);
 
        switch (numDia){
            case 1: diaSemana = "Domingo";
                break;
            case 2: diaSemana = "Lunes";
                break;
            case 3: diaSemana = "Martes";
                break;
            case 4: diaSemana = "Miercoles";
                break;
            case 5: diaSemana = "Jueves";
                break;
            case 6: diaSemana = "Viernes";
                break;
            case 7: diaSemana = "Sabado";
                break;
        }
        
        return diaSemana;
	}
}
