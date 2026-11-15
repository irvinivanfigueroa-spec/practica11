public class Vaca implements Animal {
    private String nombre;

    public Vaca(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: muu");
    }
}
