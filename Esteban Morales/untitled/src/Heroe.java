public class Heroe {
    public enum Raza { HUMANO, MUTANTE, ALIENIGENA }
    public enum Habilidad { TELEPATIA, SUPERFUERZA, VUELO }

    private String nombre;
    private Raza raza;
    private int nivelPoder;
    private Habilidad habilidad;

    public Heroe() {
        this.nombre = "Spider-Man";
        this.raza = Raza.HUMANO;
        this.nivelPoder = 85;
        this.habilidad = Habilidad.SUPERFUERZA;
    }

    public Heroe(String nombre, Raza raza, int nivelPoder, Habilidad habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Nivel de Poder: " + nivelPoder);
        System.out.println("Habilidad: " + habilidad);
    }
}


