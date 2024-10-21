import java.util.*;

public class Vuelo {

	ArrayList<Pasajero> pasajeros;
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
		this.pasajeros = new ArrayList<>();
    }

    public String getCiudadPartida() {

		return this.ciudadPartida;
	}
	public void setCiudadPartida(String ciudadPartida) {

		this.ciudadPartida = ciudadPartida;
	}

	public String getCiudadDestino() {

		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {

		this.ciudadDestino = ciudadDestino;
	}

	public String getFechaDeSalida() {

		return this.fechaDeSalida;
	}

	public void setFechaDeSalida(String fechaDeSalida) {

		this.fechaDeSalida = fechaDeSalida;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {

		return this.horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {

		this.horaLlegada = horaLlegada;
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

	public void agregarPasajero(Pasajero pasajero) {
	}

	public ArrayList<Pasajero> getPasajeros() {
		return this.pasajeros;
	}
}