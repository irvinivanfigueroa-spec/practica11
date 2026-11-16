/**
 * Programa de prueba del sistema de transporte.
 * Demuestra el polimorfismo: un arreglo de tipo Vehiculo guarda objetos
 * de distintas subclases y el mismo mensaje (calcularConsumo / recorrer)
 * produce un resultado diferente en cada uno.
 */
public class Main {

    public static void main(String[] args) {

        // Referencia polimórfica: Vehiculo[] guarda cualquier subtipo
        Vehiculo[] flota = {
            new Automovil("Sedán"),
            new Autobus("Ruta 12"),
            new CamionDeCarga("Camión vacío", 0),
            new CamionDeCarga("Camión ligero", 100),
            new CamionDeCarga("Camión pesado", 200)
        };

        System.out.println("=== Estado inicial de la flota ===");
        for (Vehiculo v : flota) {
            System.out.println(v);
        }

        double km = 3;
        System.out.println("\n=== Consumo calculado para " + km + " km ===");
        for (Vehiculo v : flota) {
            // Mismo mensaje, distinto comportamiento según el objeto real
            System.out.printf("%-14s -> %.1f%%%n",
                    v.getNombre(), v.calcularConsumo(km));
        }

        System.out.println("\n=== Primer viaje de " + km + " km ===");
        for (Vehiculo v : flota) {
            viajar(v, km);
        }

        System.out.println("\n=== Segundo viaje de " + km + " km ===");
        for (Vehiculo v : flota) {
            viajar(v, km);
        }

        System.out.println("\n=== Recarga del autobús y nuevo intento ===");
        flota[1].recargar();
        viajar(flota[1], km);

        System.out.println("\n=== Validaciones ===");
        try {
            flota[0].recorrer(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
        try {
            new CamionDeCarga("Camión inválido", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }

    /**
     * Recibe cualquier Vehiculo (Automovil, Autobus o CamionDeCarga).
     */
    private static void viajar(Vehiculo v, double km) {
        if (v.recorrer(km)) {
            System.out.println(v);
        } else {
            System.out.println(v + "  <- combustible insuficiente para "
                    + km + " km");
        }
    }
}
