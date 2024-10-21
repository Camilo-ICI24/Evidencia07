import java.util.*;

public class Piloto {

	private ArrayList<Vuelo> vuelo;
	private String nombrePiloto;
	private Vuelo vuelosAsignados;

	public Piloto(String nombrePiloto) {
	}

	public String getNombrePiloto() {

		return this.nombrePiloto;
	}

	/**
	 * 
	 * @param nombrePiloto
	 */
	public void setNombrePiloto(String nombrePiloto) {

		this.nombrePiloto = nombrePiloto;
	}

	public Vuelo getVuelosAsignados() {

		return this.vuelosAsignados;
	}

	/**
	 * 
	 * @param vuelosAsignados
	 */
	public void setVuelosAsignados(Vuelo vuelosAsignados) {
		this.vuelosAsignados = vuelosAsignados;
	}

}