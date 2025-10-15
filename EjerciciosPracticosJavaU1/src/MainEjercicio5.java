import java.nio.channels.Pipe;

public class MainEjercicio5 {
    /*
    * Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o
    * el nombre de una aplicación) y variables para información que puede cambiar. Muestra todos los valores.
    *
    * */

    public static void main(String[] args){
        // Declaracion de Variables Constantes
        final String nombreAplicacion = "Mi App";
        final String versionApp = "1.0.0";


        //Declaracion de variables no Constantes
        String nombreUsuario = "Peter";
        int nivelUsuario = 1;
        int puntuacion = 0;

        // Salida Actual
        System.out.println("Aplicación: " + nombreAplicacion);
        System.out.println("Version App: " +versionApp);
        System.out.println("Usuario Actual: " + nombreUsuario);
        System.out.println("Nivel: " +nivelUsuario);
        System.out.println("Puntuación: " + puntuacion);

        // Salida Actualizada
        nombreUsuario = "Miguel";
        nivelUsuario = 2;
        puntuacion = 150;

        System.out.println("Usuario Actualizado: " + nombreUsuario);
        System.out.println("Nivel actualizado: " +nivelUsuario);
        System.out.println("Puntuación actualizada: " + puntuacion);
    }
}
