package PackPLA2.PAC2;

public class UltimoDiaMes {
	
	private int mes;
	private int anyo;
	

	public UltimoDiaMes(int mes, int anyo) {
		this.mes = mes;
		this.anyo = anyo;

	}


	
	public int ultimoDiaMes(int mes, int anyo) {
		
		  switch (mes) {
		    // meses con 31 días
		    // __________________________________________
               case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                  return 31;
                  
      	    // meses con 30 días
      		// __________________________________________
               case 4: case 6: case 9: case 11:
                  return  30;
                  
           // control mes de Febrero
   		   // __________________________________________
              case 2:
            	if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)))
            			return 29;
            		else
            			return 28;
		  }

		  return 0;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAnyo() {
		return anyo;
	}



	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
