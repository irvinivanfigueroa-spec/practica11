public class Bateria extends Instrumento {

    public Bateria() {
        super("Bateria");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": pum pum tss");
    }
}
