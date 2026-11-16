/**
 * Autobús: cada kilómetro recorrido resta 20 % de combustible.
 */
public class Autobus extends Vehiculo {

    private static final double CONSUMO_POR_KM = 20.0;   // % por km

    public Autobus(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularConsumo(double km) {
        validarKilometros(km);
        return km * CONSUMO_POR_KM;
    }
}
