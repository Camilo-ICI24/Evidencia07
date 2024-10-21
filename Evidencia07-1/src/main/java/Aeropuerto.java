import java.util.*;
import java.util.ArrayList;

public class Aeropuerto {

	ArrayList<Avion> avion;
	private Avion aviones;
	private Piloto pilotosDeVuelo;

	public Avion getAviones() {

		return this.aviones;
	}

	/**
	 * 
	 * @param aviones
	 */
	public void setAviones(Avion aviones) {

		this.aviones = aviones;
	}

	public Piloto getPilotosDeVuelo() {

		return this.pilotosDeVuelo;
	}

	/**
	 * 
	 * @param pilotosDeVuelo
	 */
	public void setPilotosDeVuelo(Piloto pilotosDeVuelo) {

		this.pilotosDeVuelo = pilotosDeVuelo;
	}

	public void agregarAvion(Avion avion) {
		this.aviones.add(avion);
	}

}