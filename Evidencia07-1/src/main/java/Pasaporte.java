public class Pasaporte {

	Pasajero pasajero;
	private int idPasaporte;
	private String nacionalidad;
	private int cantidadHojasDisponibles;
	private String fechaExpiracion;

	public Pasaporte(int idPasaporte, String nacionalidad, int cantidadHojasDisponibles,
					 String fechaExpiracion) {
	}

	public int getIdPasaporte() {
		return this.idPasaporte;
	}

	/**
	 * 
	 * @param idPasaporte
	 */
	public void setIdPasaporte(int idPasaporte) {
		this.idPasaporte = idPasaporte;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getCantidadHojasDisponibles() {
		return this.cantidadHojasDisponibles;
	}

	/**
	 * 
	 * @param cantidadHojasDisponibles
	 */
	public void setCantidadHojasDisponibles(int cantidadHojasDisponibles) {
		this.cantidadHojasDisponibles = cantidadHojasDisponibles;
	}

	public String getFechaExpiracion() {

		return this.fechaExpiracion;
	}

	/**
	 * 
	 * @param fechaExpiracion
	 */
	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public boolean pasaporteValido() {
		if (this.idPasaporte <= 0) {
			return false;
		}

		if (this.idPasaporte < 2024) {
			return false;
		}

		if (this.cantidadHojasDisponibles == 0) {
			return false;
		}

		return true;
	}
}