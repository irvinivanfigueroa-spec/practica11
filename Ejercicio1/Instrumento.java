public abstract class Instrumento {
    private String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void hacerSonido();
}
