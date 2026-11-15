public class Gato implements Animal {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: miau");
    }
}
