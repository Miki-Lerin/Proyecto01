package PackPLA2PAC1;

public class Vacuna {

	private Fecha fechaVacuna;
	private Fecha proximaFechaVacuna;
	private String tipoVacuna;
	private String loteVacuna;
	private Fecha fechaCaducidad;
	private String nifVeterinario;
	
	public Vacuna(Fecha fechaVacuna, Fecha proximaFechaVacuna, String tipoVacuna, 
			String loteVacuna, Fecha fechaCaducidad, String nifVeterinario) {
		this.fechaVacuna = fechaVacuna;
		this.proximaFechaVacuna = proximaFechaVacuna;
		this.tipoVacuna = tipoVacuna;
		this.loteVacuna = loteVacuna;
		this.fechaCaducidad = fechaCaducidad;
		this.nifVeterinario = nifVeterinario;
	}

	public Fecha getFechaVacuna() {
		return fechaVacuna;
	}

	public void setFechaVacuna(Fecha fechaVacuna) {
		this.fechaVacuna = fechaVacuna;
	}

	public Fecha getProximaFechaVacuna() {
		return proximaFechaVacuna;
	}

	public void setProximaFechaVacuna(Fecha proximaFechaVacuna) {
		this.proximaFechaVacuna = proximaFechaVacuna;
	}

	public String getTipoVacuna() {
		return tipoVacuna;
	}

	public void setTipoVacuna(String tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public String getLoteVacuna() {
		return loteVacuna;
	}

	public void setLoteVacuna(String loteVacuna) {
		this.loteVacuna = loteVacuna;
	}

	public Fecha getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNifVeterinario() {
		return nifVeterinario;
	}

	public void setNifVeterinario(String nifVeterinario) {
		this.nifVeterinario = nifVeterinario;
	}

	@Override
	public String toString() {
		return "Vacuna [fechaVacuna=" + fechaVacuna + ", proximaFechaVacuna=" + proximaFechaVacuna + ", tipoVacuna="
				+ tipoVacuna + ", loteVacuna=" + loteVacuna + ", fechaCaducidad=" + fechaCaducidad + ", nifVeterinario="
				+ nifVeterinario + "]";
	}
}
