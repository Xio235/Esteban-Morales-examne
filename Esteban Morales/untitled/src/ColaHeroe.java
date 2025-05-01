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
            Heroe h = cola.poll();
            System.out.println(h.getNombre() + " ha sido quitado de la cola.");
            return h;
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
            for (Heroe h : cola) {
                h.mostrarInfo();
                System.out.println("-------");
            }
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public static void main(String[] args) {
        Heroe h1 = new Heroe("Esteban", Heroe.Raza.MUTANTE, 95, Heroe.Habilidad.TELEPATIA);
        Heroe h2 = new Heroe("Superman", Heroe.Raza.ALIENIGENA, 100, Heroe.Habilidad.VUELO);
        Heroe h3 = new Heroe();

        ColaHeroe cola = new ColaHeroe();
        cola.añadirHeroe(h1);
        cola.añadirHeroe(h2);
        cola.añadirHeroe(h3);

        cola.verElementosDeLaCola();

        System.out.println("\nPrimer héroe: " + cola.verPrimerHeroe().getNombre());

        cola.quitarHeroe();
        System.out.println("\nDespués de quitar un héroe:");
        cola.verElementosDeLaCola();
    }
}

