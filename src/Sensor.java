public class Sensor {
    public String nombre;
    String tipo; // acceso por defecto
    public double lectura;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura);
    }

    void mostrarLectura() { // acceso por defecto
        System.out.println("Lectura: " + lectura);
    }

    // Desafío
    public void actualizarLectura(double nuevaLectura) {
        lectura = nuevaLectura;
    }
}