public class Bibliotecario extends Persona implements Gestionable {

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + nombre + " " + apellido);
    }

    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getPrestamosActuales() < 3 && libro.isDisponible()) {
            libro.prestar();
            usuario.incrementarPrestamos();
            System.out.println("Libro prestado a: " + usuario.nombre + " " + usuario.apellido);
        } else {
            System.out.println("No se puede prestar el libro. " +
                    (usuario.getPrestamosActuales() >= 3 ? "El usuario ha alcanzado el máximo de préstamos." : "El libro no está disponible."));
        }
    }

    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        libro.devolver();
        usuario.reducirPrestamos();
        System.out.println("Libro devuelto por: " + usuario.nombre + " " + usuario.apellido);
    }
}

