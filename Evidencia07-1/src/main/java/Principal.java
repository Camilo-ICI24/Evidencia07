import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();

        Avion latamAir = new Avion();
        Avion skyAir = new Avion();

        Piloto piloto1 = new Piloto("Carlo");
        Piloto piloto2 = new Piloto("Lucas");

        Vuelo vuelo1 = new Vuelo("Santiago", "Buenos Aires",
                "2024-10-21", "10:00", "14:00", piloto1);
        Vuelo vuelo2 = new Vuelo("Madrid", "Nueva York",
                "2024-10-22", "11:00", "15:00", piloto2);

        latamAir.setVueloDelAvion(vuelo1);
        skyAir.setVueloDelAvion(vuelo2);

        aeropuerto.agregarAvion(latamAir);
        aeropuerto.agregarAvion(skyAir);

        aeropuerto.agregarPiloto(piloto1);
        aeropuerto.agregarPiloto(piloto2);

        Pasaporte pasaporte1 = new Pasaporte(442495, "Chile",
                4, "2027");
        Pasaporte pasaporte2 = new Pasaporte(67890, "Japón",
                1, "2022");

        Pasajero pasajero1 = new Pasajero(pasaporte1);
        Pasajero pasajero2 = new Pasajero(pasaporte2);

        vuelo1.agregarPasajero(pasajero1);
        vuelo2.agregarPasajero(pasajero2);

        if (pasaporte1.pasaporteValido()) {
            System.out.println("¡Pasaporte válido! Proceda");
        } else {
            System.out.println("ERROR: Pasaporte inválido");
        }

        if (pasaporte2.pasaporteValido()) {
            System.out.println("¡Pasaporte válido! Proceda");
        } else {
            System.out.println("ERROR: Pasaporte inválido");
        }

        String fechaBusqueda = "2024-03-15";
        List<Vuelo> vuelosEnFecha = aeropuerto.buscarVuelosPorFecha(fechaBusqueda);
        System.out.println("Vuelos encontrados el " + fechaBusqueda + ": " + vuelosEnFecha.size());

        System.out.println("Pasajeros del vuelo a " + vuelo1.getCiudadDestino() + ":");
        for (Pasajero pasajero : vuelo1.getPasajeros()) {
            System.out.println("Pasajero con pasaporte ID: " + pasajero.getPasaportePasajero().getIdPasaporte());
        }
    }
}
