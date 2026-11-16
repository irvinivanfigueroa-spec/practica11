/**
 * Camión de carga: el consumo por kilómetro depende del peso que transporta.
 *
 *   Sin carga (0 kg)       -> 10 % por km
 *   De 1 a 150 kg          -> 15 % por km
 *   Más de 150 kg          -> 20 % por km
 */
public class CamionDeCarga extends Vehiculo {

    private static final double CONSUMO_SIN_CARGA = 10.0;   // % por km
    private static final double CONSUMO_CARGA_LIGERA = 15.0; // % por km
    private static final double CONSUMO_CARGA_PESADA = 20.0; // % por km
    private static final int LIMITE_CARGA_LIGERA = 150;      // kg

    private int carga;   // en kilogramos

    public CamionDeCarga(String nombre, int carga) {
        super(nombre);
        validarCarga(carga);
        this.carga = carga;
    }

    /**
     * @throws IllegalArgumentException si la carga es negativa
     */
    public void setCarga(int carga) {
        validarCarga(carga);
        this.carga = carga;
    }

    private static void validarCarga(int carga) {
        if (carga < 0) {
            throw new IllegalArgumentException(
                    "La carga no puede ser negativa: " + carga);
        }
    }

    public int getCarga() {
        return carga;
    }

    /** Devuelve el porcentaje que consume cada km según la carga actual. */
    private double consumoPorKm() {
        if (carga == 0) {
            return CONSUMO_SIN_CARGA;
        } else if (carga <= LIMITE_CARGA_LIGERA) {
            return CONSUMO_CARGA_LIGERA;
        } else {
            return CONSUMO_CARGA_PESADA;
        }
    }

    @Override
    public double calcularConsumo(double km) {
        validarKilometros(km);
        return km * consumoPorKm();
    }

    @Override
    public String toString() {
        return super.toString() + " | carga: " + carga + " kg";
    }
}
