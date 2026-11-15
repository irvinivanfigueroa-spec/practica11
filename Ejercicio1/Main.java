public class Main {
    public static void main(String[] args) {
        Instrumento instrumento = new Guitarra();
        instrumento.hacerSonido();
        instrumento = new Piano();
        instrumento.hacerSonido();

        Instrumento[] orquesta = {
            new Guitarra(),
            new Piano(),
            new Bateria(),
            new Flauta()
        };

        for (Instrumento i : orquesta) {
            i.hacerSonido();
        }
    }
}
