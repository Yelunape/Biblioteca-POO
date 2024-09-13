public class Usuario extends Persona {
    private int prestamosActuales;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.prestamosActuales = 0;
    }

    public int getPrestamosActuales() {
        return prestamosActuales;
    }

    public void incrementarPrestamos() {
        this.prestamosActuales++;
    }

    public void reducirPrestamos() {
        this.prestamosActuales--;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " " + apellido + " - Préstamos actuales: " + prestamosActuales);
    }
}

