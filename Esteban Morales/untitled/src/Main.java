public class Heroe {

    private String nombre;
    private String raza;
    private int nivelPoder;
    private String habilidad;

    public Heroe() {
        this.nombre = "Spider-Man";
        this.raza = "Humano";
        this.nivelPoder = 85;
        this.habilidad = "Sentido arácnido";
    }

    public Heroe(String nombre, String raza, int nivelPoder, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Nivel de Poder: " + nivelPoder);
        System.out.println("Habilidad: " + habilidad);
    }

    public static void main(String[] args) {
        Heroe heroe1 = new Heroe();  // Usa el constructor por defecto
        Heroe heroe2 = new Heroe("Thor", "Asgardiano", 95, "Control del trueno");  // Usa el constructor con parámetros

        heroe1.mostrarInfo();
        System.out.println();
        heroe2.mostrarInfo();
    }
}
