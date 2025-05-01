import java.util.LinkedList;
import java.util.Queue;

public class ColaHeroe {
    private Queue<Heroe> cola;

    public ColaHeroe() {
        this.cola = new LinkedList<>();
    }

    public void añadirHeroe(Heroe heroe) {
        cola.add(heroe);
        System.out.println(heroe.getNombre() + " añadido a la cola.");
    }

    public Heroe quitarHeroe() {
        if (!cola.isEmpty()) {
            Heroe heroeQuitado = cola.poll();
            System.out.println(heroeQuitado.getNombre() + " ha sido quitado de la cola.");
            return heroeQuitado;
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public Heroe verPrimerHeroe() {
        if (!cola.isEmpty()) {
            return cola.peek();
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void verElementosDeLaCola() {
        if (!cola.isEmpty()) {
            System.out.println("Héroes en la cola:");
            for (Heroe heroe : cola) {
                heroe.mostrarInfo();
                System.out.println("------");
            }
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public static void main(String[] args) {
        // Crear algunos héroes
        Heroe heroe1 = new Heroe("Iron Man", "Humano", 90, "Tecnología avanzada");
        Heroe heroe2 = new Heroe("Hulk", "Humano", 100, "Fuerza bruta");
        Heroe heroe3 = new Heroe("Black Widow", "Humano", 80, "Habilidades de espionaje");

        ColaHeroe cola = new ColaHeroe();

        cola.añadirHeroe(heroe1);
        cola.añadirHeroe(heroe2);
        cola.añadirHeroe(heroe3);

        cola.verElementosDeLaCola();

        Heroe primerHeroe = cola.verPrimerHeroe();
        if (primerHeroe != null) {
            System.out.println("El primer héroe en la cola es: " + primerHeroe.getNombre());
        }

        cola.quitarHeroe();
        cola.verElementosDeLaCola();

        System.out.println("¿La cola está vacía? " + cola.estaVacia());
    }
}
