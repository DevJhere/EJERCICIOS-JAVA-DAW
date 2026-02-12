package ejercicio4;

import java.util.Scanner;

public class Main {
    /*Crea una clase EdadInvalidaException que herede de Exception. Crea un método validarEdad(int edad) que lance esta
      excepción si la edad es menor que 0 o mayor que 120. En el método main, pide al usuario su edad y usa try-catch para
      capturar y manejar la excepción personalizada.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Validador de edad");
        System.out.print("Introduce tu edad: ");
        try {
            int edad = Integer.parseInt(sc.nextLine());

            //Comprobamos edad
            validarEdad(edad);

            System.out.println("Edad registrada correctamente " + edad + " años");

        } catch (EdadInvalidaExcepcion e) {
            System.out.println("Error. " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Se debe escribir un número entero.");
        }
        sc.close();
    }

    public static void validarEdad(int edad) throws EdadInvalidaExcepcion{
        if (edad < 0 ){
            throw new EdadInvalidaExcepcion("La edad no puede ser negativa");
        }
        if (edad > 120){
            throw new EdadInvalidaExcepcion("Nadie a sobrevivido tanto tiempo.");
        }
    }
}
