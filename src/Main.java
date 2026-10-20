public class Main {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        sensor1.nombre = "S1";
        sensor1.tipo = "Temperatura";
        sensor1.lectura = 25.5;

        sensor2.nombre = "S2";
        sensor2.tipo = "Humedad";
        sensor2.lectura = 60;

        sensor1.mostrarInformacion();
        sensor1.mostrarLectura();
        sensor2.mostrarInformacion();
        sensor2.mostrarLectura();

        // Paso 9
        sensor1.lectura = 30;
        System.out.println("--- Después de modificar sensor1 ---");
        sensor1.mostrarInformacion();
        sensor2.mostrarInformacion();

        sensor2.actualizarLectura(65);
        sensor2.mostrarLectura();
    }
}
