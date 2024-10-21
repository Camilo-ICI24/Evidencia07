import java.util.ArrayList;

public class Avion {

	private Aeropuerto aeropuerto;
	private ArrayList<Vuelo> vuelos;
	private Vuelo vueloDelAvion;

	public Avion() {
		this.vuelos = new ArrayList<>();
	}

	public Vuelo getVueloDelAvion() {
		return this.vueloDelAvion;
	}

	public void setVueloDelAvion(Vuelo vueloDelAvion) {
		this.vueloDelAvion = vueloDelAvion;
	}

	public void agregarVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
	}

	public ArrayList<Vuelo> getVuelos() {
		return this.vuelos;
	}
}
