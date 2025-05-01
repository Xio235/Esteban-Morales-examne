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
            Heroe eliminado = cola.poll();
            System.out.println(eliminado.getNombre() + " ha sido quitado de la cola.");
            return eliminado;
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
            for (Heroe h : cola) {
                h.mostrarInfo();
                System.out.println("------");
            }
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public void encolarCincoHeroes() {
        Heroe h1 = new Heroe();
        Heroe h2 = new Heroe("Jean Grey", Heroe.Raza.MUTANTE, 95, Heroe.Habilidad.TELEPATIA);
        Heroe h3 = new Heroe("Hulk", Heroe.Raza.HUMANO, 98, Heroe.Habilidad.SUPERFUERZA);
        Heroe h4 = new Heroe("Thor", Heroe.Raza.ALIENIGENA, 96, Heroe.Habilidad.VUELO);
        Heroe h5 = new Heroe("Rogue", Heroe.Raza.MUTANTE, 89, Heroe.Habilidad.SUPERFUERZA);

        añadirHeroe(h1);
        añadirHeroe(h2);
        añadirHeroe(h3);
        añadirHeroe(h4);
        añadirHeroe(h5);
    }

    public static void main(String[] args) {
        ColaHeroe cola = new ColaHeroe();

        cola.encolarCincoHeroes();

        System.out.println("\n--- Héroes en la cola ---");
        cola.verElementosDeLaCola();

        Heroe primero = cola.verPrimerHeroe();
        if (primero != null) {
            System.out.println("\nPrimer héroe en la cola: " + primero.getNombre());
        }

        System.out.println("\n--- Quitando un héroe ---");
        cola.quitarHeroe();

        System.out.println("\n--- Héroes restantes ---");
        cola.verElementosDeLaCola();

        System.out.println("\n¿La cola está vacía? " + cola.estaVacia());
    }
}
