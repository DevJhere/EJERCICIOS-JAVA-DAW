public class MainEjercicio4 {
    //## Ejercicio 4: Variables con nombres descriptivos
    //
    //Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
    // Muestra toda la información del libro en la consola.

    public static void main(String[] args){
        //Declarición de Variables
        String tituloLibro;
        String nombreAutor;
        int anioPublicado;
        int numeroPaginas;
        boolean disponible = true;


        //Asignacion de Variables
        tituloLibro = "El señor de los Anillos";
        nombreAutor = "John Ronald Reuel Tolkien";
        anioPublicado = 1892;
        numeroPaginas = 1100;


        //Resultado
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Autor: " + nombreAutor);
        System.out.println("Año de Publicación: " + anioPublicado);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("¿Disponible en la Biblioteca?: " + disponible);
    }
}
