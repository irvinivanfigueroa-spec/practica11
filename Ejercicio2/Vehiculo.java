/**
 * Clase abstracta que representa el concepto general de "vehículo".
 * No se puede instanciar (no existe new Vehiculo()), pero sí se usa como
 * tipo de referencia para guardar objetos de sus subclases (polimorfismo).
 *
 * El combustible se maneja como porcentaje: 100 = tanque lleno, 0 = vacío.
 */
public abstract class Vehiculo {

    // Constante compartida por todos los vehículos (static final)
    public static final double COMBUSTIBLE_MAXIMO = 100.0;

    // Atributos privados (encapsulamiento)
    private String nombre;
    private double combustible;

    /**
     * Todo vehículo nuevo inicia con el tanque lleno.
     *
     * @param nombre identificador del vehículo
     */
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.combustible = COMBUSTIBLE_MAXIMO;
    }

    /**
     * Método abstracto: cada subclase concreta está obligada a implementarlo
     * y decide cómo calcula el porcentaje de combustible que consume.
     *
     * @param km kilómetros a recorrer (no negativos)
     * @return porcentaje de combustible que se consumiría en ese recorrido
     */
    public abstract double calcularConsumo(double km);

    /**
     * Método concreto, heredado tal cual por todas las subclases.
     * Llama a calcularConsumo(km): Java decide en ejecución (ligadura
     * dinámica) cuál versión usar según el objeto real.
     *
     * @param km kilómetros a recorrer
     * @return true si el recorrido se realizó; false si el combustible no alcanza
     */
    public boolean recorrer(double km) {
        double consumo = calcularConsumo(km);
        if (consumo > combustible) {
            return false;          // no alcanza: el vehículo no se mueve
        }
        combustible -= consumo;
        return true;
    }

    /** Llena el tanque al 100 %. */
    public void recargar() {
        combustible = COMBUSTIBLE_MAXIMO;
    }

    /**
     * Valida los kilómetros; lo reutilizan las subclases.
     *
     * @throws IllegalArgumentException si km es negativo
     */
    protected void validarKilometros(double km) {
        if (km < 0) {
            throw new IllegalArgumentException(
                    "Los kilómetros no pueden ser negativos: " + km);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    @Override
    public String toString() {
        return String.format("%s '%s' | combustible: %.1f%%",
                getClass().getSimpleName(), nombre, combustible);
    }
}
