package ejercicio1;

public class Main {
    /*
    * Crea una clase Animal con atributos nombre y edad, y un método hacerSonido(). Luego crea dos clases hijas:
    *Perro y Gato que hereden de Animal. Sobrescribe el método hacerSonido() en cada clase hija para que muestre el
    *sonido correspondiente. Crea objetos de cada tipo y prueba los métodos.
    * */

    public static void main(String[] args) {

        System.out.println("------ PRUEBA DE PERRO ------");
        //Instanciamos Objeto Perro
        Perro perro1 = new Perro("Rex", 5, "Mover la cola");

        System.out.println("Animal: " + perro1.getNombre() + ", " + perro1.getEdad() + " años");

        //Comprobamos metodo hacersonido()
        perro1.hacerSonido();

        System.out.println();

        System.out.println("------ PRUEBA DE GATO ------");
        //Instanciamos Objeto Perro
        Gato gato1 = new Gato("Micha", 5, "Ronronear");

        System.out.println("Animal: " + perro1.getNombre() + ", " + perro1.getEdad() + " años");

        //Comprobamos método hacersonido()
        perro1.hacerSonido();

    }
}
