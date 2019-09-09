package PackPLA2PAC1;

// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
import java.time.LocalDate;
// import java.util.Date;

public class Fecha {
	
	 public int dia;
	 public int mes;
	 public int a�o;
	 
	 public Fecha(int nuevoDia, int nuevoMes, int nuevoA�o) {
 	   dia = nuevoDia;
	   mes = nuevoMes;
	   a�o = nuevoA�o;
	}
	 
	public int getFecha() {
		return ((a�o * 10000) + (mes * 100) + (dia * 1));
	}
	
	public int getFechaActual() {
	//	Date date = new Date();
	//	DateFormat datehourFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	//	DateFormat datehourFormat = new SimpleDateFormat("yyyyMMdd");
	//	String convertido = datehourFormat.format(date);
	//	System.out.println(convertido);
 	//	return convertido;
 		
		LocalDate today = LocalDate.now();
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		return ((year * 10000) + (month * 100) + day);
	}
	
	public void imprimir() {
		System.out.println(dia + "/" + mes + "/" + a�o);
	}
	
	public void setDia(int nuevoDia) {
		dia = nuevoDia;
	}
	
	public void setMes(int nuevoMes) {
		mes = nuevoMes;
	}
	
	public void setA�o(int nuevoA�o) {
		a�o = nuevoA�o;
	}
}
