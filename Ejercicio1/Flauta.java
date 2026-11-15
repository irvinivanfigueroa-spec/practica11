public class Flauta extends Instrumento {

    public Flauta() {
        super("Flauta");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": tuuu");
    }
}
