public class Mono implements Animal {
    private String nombre;

    public Mono(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: uh uh ah ah");
    }
}
