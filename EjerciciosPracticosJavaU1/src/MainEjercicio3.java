public class MainEjercicio3 {
    //    ## Ejercicio 3: Tipos de variables
    //
    //    Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.

    public static void main(String[] args){
        //Declaracion de Variables
        String nombre = "Carlos";
        int edad = 30;
        boolean resultadoFinal = true;
        double notaFinal = 8.5;
        char inicial = 'C';

        //Mostramos por consola resultado
        System.out.println("Nombre: " + nombre + " (Tipo: " + ((Object)nombre).getClass().getSimpleName() + ")");
        System.out.println("Edad: " + edad + " - (Tipo: int)");
        System.out.println("Aprobado/Suspendido: " + resultadoFinal + " - (Tipo: boolean)");
        System.out.println("Nota Final: " + notaFinal + " - (Tipo: Double)");
        System.out.println("Inicial Nombre: " + inicial + " - (Tipo: Char)");
    }
}
