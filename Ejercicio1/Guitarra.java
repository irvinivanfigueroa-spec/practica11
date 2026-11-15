public class Guitarra extends Instrumento {

    public Guitarra() {
        super("Guitarra");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": rasgueo de cuerdas");
    }
}
