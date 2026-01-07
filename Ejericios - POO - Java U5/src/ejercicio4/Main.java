package ejercicio4;

public class Main {
    /*Crea una clase Libro con atributos título, autor y páginas. Implementa tres constructores:
    uno sin parámetros (valores por defecto), uno con título y autor, y otro con los tres parámetros.
    Crea tres objetos usando cada constructor y muestra sus datos.*/

    public static void main(String[] args) {

        //Creamos 3 objetos para verificar el funcionamiento

        //Objeto por defecto
        Libro libro1 = new Libro();

        //Objeto con dos atributos
        Libro libro2 = new Libro("El señor de los Anillos", "J.R.R Tolkien");

        //Objeto con tres atributos
        Libro libro3 = new Libro("Cien años de Soledad", "Gabriel García Márquez", 471);

        System.out.println("Libro 1: " + libro1.getTitulo() + ", Autor: " + libro1.getAutor() + ", " + libro1.getNumeroPaginas() + " páginas");
        System.out.println("Libro 2: " + libro2.getTitulo() + ", Autor: " + libro2.getAutor() + ", " + libro2.getNumeroPaginas() + " páginas");
        System.out.println("Libro 3: " + libro3.getTitulo() + ", Autor: " + libro3.getAutor() + ", " + libro3.getNumeroPaginas() + " páginas");
    }
}
