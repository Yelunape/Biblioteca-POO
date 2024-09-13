import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creando instancias Bibliotecario y Usuario
        Bibliotecario bibliotecario = new Bibliotecario("María", "González");
        Usuario usuario1 = new Usuario("Carlos", "Pérez");

        // Creando instancia Libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321");

        // Mostrando información de las personas
        bibliotecario.mostrarDatos();
        usuario1.mostrarDatos();

        // Simulando préstamos de libros
        bibliotecario.prestarLibro(libro1, usuario1); // Primer préstamo
        bibliotecario.prestarLibro(libro2, usuario1); // Segundo préstamo

        // Simulando devolución de libro
        bibliotecario.devolverLibro(libro1, usuario1);

        // Contando libros prestados POO
        int librosPrestados = (libro1.isDisponible() ? 0 : 1) + (libro2.isDisponible() ? 0 : 1);
        System.out.println("Total de libros prestados (POO): " + librosPrestados);

        // Contando libros prestados (Funcional)
        List<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);

        long totalPrestadosFuncional = libros.stream().filter(libro -> !libro.isDisponible()).count();
        System.out.println("Total de libros prestados (Funcional): " + totalPrestadosFuncional);

    }
}