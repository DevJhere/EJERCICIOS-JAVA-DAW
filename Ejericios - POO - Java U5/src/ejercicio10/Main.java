package ejercicio10;

public class Main {
    /*
    * Crea un sistema de biblioteca con las clases: Libro (título, autor, ISBN, disponible),
    * Usuario (nombre, numeroSocio) y Préstamo (libro, usuario, fechaPréstamo). Implementa métodos para prestar un libro
    * (si está disponible) y devolverlo. Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.*/
    public static void main(String[] args) {

        //Creamos un objeto libro
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", "001");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "002");
        Libro libro3 = new Libro("El Señor de los Anillos", "J.L.L Tolkien", "003");

        Usuario usuario1 = new Usuario("Luis Perez", "101");
        Usuario usuario2 = new Usuario("María Lopez", "102");



        System.out.println("---BIBLIOTECA----");
        System.out.println("Libros Disponibles: ");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println();

        //PRÉSTAMO 1
        System.out.println(usuario1 + " intenta tomar prestado " + libro1.getTitulo());
        if (libro1.estaDisponible()){
            libro1.prestar();
            Prestamo p1 = new Prestamo(libro1, usuario1, "20/01/2026");
            System.out.println("✓ Préstamo realizado el " + p1.getFechaPrestamo());
        }else {
            System.out.println("✗ El libro no está disponible");
        }
        System.out.println();

        //PRESTAMO 2
        System.out.println(usuario2 + " intenta tomar prestado " + libro1.getTitulo());
        if (libro2.estaDisponible()){
            libro2.prestar();
            Prestamo p2 = new Prestamo(libro2, usuario2, "20/01/2026");
            System.out.println("✓ Préstamo realizado el " + p2.getFechaPrestamo());
        }else {
            System.out.println("✗ El libro no está disponible");
        }
        System.out.println();

        //DEVOLUCIÓN
        System.out.println(usuario1.getNombre() + " devuelve " + libro1);

        //Aplicamos Devolución
        libro1.devolver();
        System.out.println("✓ Libro devuelto");

        System.out.println();

        // 4. MOSTRAR ESTADO FINAL
        System.out.println("Libros disponibles ahora:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
