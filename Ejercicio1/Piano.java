public class Piano extends Instrumento {

    public Piano() {
        super("Piano");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": suenan las teclas");
    }
}
