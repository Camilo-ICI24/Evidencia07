import java.util.*;

public class Pasajero {

	Collection<Pasaporte> pasaporte;
	private Pasaporte pasaportePasajero;

	public Pasaporte getPasaportePasajero() {
		return this.pasaportePasajero;
	}

	/**
	 * 
	 * @param pasaportePasajero
	 */
	public void setPasaportePasajero(Pasaporte pasaportePasajero) {
		this.pasaportePasajero = pasaportePasajero;
	}

}