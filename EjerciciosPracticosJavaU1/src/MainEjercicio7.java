import javax.xml.transform.Source;

public class MainEjercicio7 {
    //## Ejercicio 7: Presentación personal
    //
    //Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad) en variables y
    // muestre un mensaje de presentación por consola.

    public static void main(String[] args){
        //Declaracion de Variables
        String nombre, apellido, ciudad;
        int edad;

        //Asignacion de Valores
        nombre = "Alex";
        apellido = "Lema";
        ciudad = "Langreo";
        edad = 30;

        System.out.println("Hola! Me llamo " + nombre + " " +  apellido + " ." );
        System.out.println("Tengo " + edad + " años y vivo en " + ciudad);
    }
}
