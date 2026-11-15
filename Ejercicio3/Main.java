import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro("Rocky");
        animal.hacerSonido();
        animal = new Gato("Misu");
        animal.hacerSonido();

        ArrayList<Animal> zoologico = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            switch (i % 4) {
                case 0:
                    zoologico.add(new Perro("Perro " + i));
                    break;
                case 1:
                    zoologico.add(new Gato("Gato " + i));
                    break;
                case 2:
                    zoologico.add(new Vaca("Vaca " + i));
                    break;
                default:
                    zoologico.add(new Leon("Leon " + i));
                    break;
            }
        }

        System.out.println("\nAnimales en el zoologico: " + zoologico.size());
        for (Animal a : zoologico) {
            a.hacerSonido();
        }

        System.out.println("\nSalen 3 animales");
        for (int i = 0; i < 3; i++) {
            zoologico.remove(0);
        }
        System.out.println("Animales en el zoologico: " + zoologico.size());

        System.out.println("\nLlega un animal nuevo");
        zoologico.add(new Mono("Mono 21"));
        System.out.println("Animales en el zoologico: " + zoologico.size());
        zoologico.get(zoologico.size() - 1).hacerSonido();
    }
}
