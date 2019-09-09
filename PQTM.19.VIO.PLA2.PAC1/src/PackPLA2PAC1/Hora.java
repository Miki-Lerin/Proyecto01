package PackPLA2PAC1;

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora (int hora, int minutos) {
		
		if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
			throw new IllegalArgumentException();
		} else {
			this.hora = hora;
			this.minutos = minutos;
			this.segundos = 0;
		}
		
	}
	
	public void imprimir() {
		System.out.println(hora + ":" + minutos + ":" + segundos);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
	}
}
