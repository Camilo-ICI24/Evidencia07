import java.util.*;
import java.util.ArrayList;

public class Aeropuerto {

	private final ArrayList<Avion> AvionesList;
	private final ArrayList<Piloto> PilotosList;
	private ArrayList<Vuelo> vuelos;
	ArrayList<Avion> avion;
	private Avion aviones;
	private Piloto pilotosDeVuelo;

	public Aeropuerto() {
		this.AvionesList = new ArrayList<>();
		this.PilotosList = new ArrayList<>();
	}

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
		this.AvionesList.add(avion);
	}

	public void agregarPiloto(Piloto piloto) {
		this.PilotosList.add(piloto);
	}

	public List<Vuelo> buscarVuelosPorFecha(String fechaDeInteres) {
		List<Vuelo> vuelosCoincidentes = new ArrayList<>();

		for (Vuelo vuelo : vuelos) {
			if (vuelo.getFechaDeSalida().equals(fechaDeInteres)) {
				vuelosCoincidentes.add(vuelo);
			}
		}

		return vuelosCoincidentes;
	}
}