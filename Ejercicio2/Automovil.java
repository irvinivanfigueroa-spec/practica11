/**
 * Automóvil: cada kilómetro recorrido resta 10 % de combustible.
 */
public class Automovil extends Vehiculo {

    private static final double CONSUMO_POR_KM = 10.0;   // % por km

    public Automovil(String nombre) {
        super(nombre);          // primero se construye la parte del padre
    }

    @Override
    public double calcularConsumo(double km) {
        validarKilometros(km);
        return km * CONSUMO_POR_KM;
    }
}
