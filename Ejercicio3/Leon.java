public class Leon implements Animal {
    private String nombre;

    public Leon(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: grrr");
    }
}
