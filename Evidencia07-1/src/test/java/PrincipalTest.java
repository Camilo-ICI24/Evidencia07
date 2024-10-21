import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {
    private Aeropuerto aeropuerto;
    private Avion latamAir;
    private Avion skyAir;
    private Piloto piloto1;
    private Piloto piloto2;
    private Vuelo vuelo1;
    private Vuelo vuelo2;
    private Pasaporte pasaporte1;
    private Pasaporte pasaporte2;

    @BeforeEach
    public void setUp() {
        // Inicialización de los objetos antes de cada prueba
        aeropuerto = new Aeropuerto();
        latamAir = new Avion();
        skyAir = new Avion();
        piloto1 = new Piloto("Carlo");
        piloto2 = new Piloto("Lucas");

        vuelo1 = new Vuelo("Santiago", "Buenos Aires",
                "2024-10-21", "10:00", "14:00", piloto1);
        vuelo2 = new Vuelo("Madrid", "Nueva York",
                "2024-10-22", "11:00", "15:00", piloto2);

        latamAir.setVueloDelAvion(vuelo1);
        skyAir.setVueloDelAvion(vuelo2);

        aeropuerto.agregarAvion(latamAir);
        aeropuerto.agregarAvion(skyAir);
        aeropuerto.agregarPiloto(piloto1);
        aeropuerto.agregarPiloto(piloto2);

        pasaporte1 = new Pasaporte(442495, "Chile", 4, 2027);
        pasaporte2 = new Pasaporte(67890, "Japón", 1, 2022);
    }

    @Test
    public void testPasaporteValido() {
        assertTrue(pasaporte1.pasaporteValido(), "Pasaporte 1 debería ser válido");
        assertFalse(pasaporte2.pasaporteValido(), "Pasaporte 2 debería ser inválido");
    }

    @Test
    public void testBuscarVuelosPorFecha() {
        List<Vuelo> vuelosEnFecha = aeropuerto.buscarVuelosPorFecha("2024-10-21");
        assertEquals(1, vuelosEnFecha.size(), "Debería encontrar 1 vuelo en la fecha especificada");

        List<Vuelo> vuelosNoEncontrados = aeropuerto.buscarVuelosPorFecha("2024-03-15");
        assertEquals(0, vuelosNoEncontrados.size(), "No debería encontrar vuelos en una fecha sin vuelos");
    }

    @Test
    public void testAgregarPasajero() {
        Pasajero pasajero1 = new Pasajero(pasaporte1);
        vuelo1.agregarPasajero(pasajero1);
        assertEquals(1, vuelo1.getPasajeros().size(), "Debería haber 1 pasajero en el vuelo 1");

        vuelo2.agregarPasajero(new Pasajero(pasaporte2));
        assertEquals(1, vuelo2.getPasajeros().size(), "Debería haber 1 pasajero en el vuelo 2");
    }
}
