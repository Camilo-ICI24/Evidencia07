import java.util.*;

public class Vuelo {

	Collection<Pasajero> pasajeros;
	Piloto piloto;
	Collection<Avion> avion;
	private String ciudadPartida;
	private String ciudadDestino;
	private String fechaDeSalida;
	private String horaSalida;
	private String horaLlegada;
	private Piloto pilotoDesignado;

    public Vuelo(String ciudadPartida, String ciudadDestino, String fechaDeSalida,
				 String horaSalida, String horaLlegada, Piloto pilotoDesignado) {
    }

    public String getCiudadPartida() {
		return this.ciudadPartida;
	}

	/**
	 * 
	 * @param ciudadPartida
	 */
	public void setCiudadPartida(String ciudadPartida) {
		this.ciudadPartida = ciudadPartida;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	/**
	 * 
	 * @param ciudadDestino
	 */
	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getFechaDeSalida() {
		return this.fechaDeSalida;
	}

	/**
	 * 
	 * @param fechaDeSalida
	 */
	public void setFechaDeSalida(String fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	/**
	 * 
	 * @param horaSalida
	 */
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return this.horaLlegada;
	}

	/**
	 * 
	 * @param horaLlegada
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public void getAttribute() {
		// TODO - implement Vuelo.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Vuelo.setAttribute
		throw new UnsupportedOperationException();
	}

	public Piloto getPilotoDesignado() {
		return this.pilotoDesignado;
	}

	/**
	 * 
	 * @param pilotoDesignado
	 */
	public void setPilotoDesignado(Piloto pilotoDesignado) {
		this.pilotoDesignado = pilotoDesignado;
	}

}