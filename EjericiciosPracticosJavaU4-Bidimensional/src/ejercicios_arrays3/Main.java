package ejercicios_arrays3;
public class Main {
    /*3. Desarrolla un programa en Java que permita registrar, calcular e informar
    las notas de varios alumnos utilizando arrays.

    a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
    b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
    nota inferior a 0 y superior a 10 volverá a pedirla
    c. Calcula y muestra:

    i. La nota media de la clase.
    ii. La nota más alta y la más baja.
    iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
    suspendido.*/
    public static void main(String[] args) {

        ControlNotas gestor = new ControlNotas();

        //Rellenamos Datos
        gestor.registrarNotasAlumnos();
        //Mostramos Informe
        gestor.mostrarInforme();

    }
}
