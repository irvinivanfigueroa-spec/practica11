public class Perro implements Animal {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: guau");
    }
}
