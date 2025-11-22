package ejercicio3;

import java.util.Scanner;

public class Main {
    /*3. Crea un programa que permita al usuario crear una pizza personalizada
    eligiendo ingredientes desde un menú.
    Reglas:
    • El programa muestra al usuario un menú con al menos cinco ingredientes
    posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
    (8), tomate (6), pepperoni (12).
    • El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
    eligiendo uno por uno. El programa debe evitar la cantidad máxima no
    se supere.
    • Por cada ingrediente elegido, el programa suma el precio
    correspondiente.
    • Después de cada selección, muestra al usuario la lista actual de
    ingredientes y el subtotal acumulado.
    • Cuando el usuario termina, muestra la pizza final detallada (con todos
    los ingredientes seleccionados) y el total a pagar.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String ingredientes = "";
        int numeroIngredientes = 0;
        int totalPizza = 0;
        int opcionIngrediente = 0;
        do {
            System.out.println("1. Queso");
            System.out.println("2. Jamon");
            System.out.println("2. Piña");
            System.out.println("4. Tomate");
            System.out.println("5. Peperonni");
            System.out.println("0. Dejar de pedir");
            System.out.print("Que ingrediente quieres: ");

            opcionIngrediente = scanner.nextInt();
            switch (opcionIngrediente){
                case 1->{
                    totalPizza +=10;
                    ingredientes += "Queso";
                }
                case 2->{
                    totalPizza +=15;
                    ingredientes += "Jamon";
                }case 3->{
                    totalPizza +=8;
                    ingredientes += "Piña";
                }
                case 4->{
                    totalPizza +=6;
                    ingredientes += "Tomate";

                }case 5->{
                    totalPizza +=12;
                    ingredientes += "Peperonni";
                }
            }
            numeroIngredientes++;
            System.out.println("El total de los ingredientes que llevas es " + totalPizza);
            System.out.println("Los ingredientes que llevas son " + ingredientes);
        }while (numeroIngredientes<5 && opcionIngrediente!=0);
    }
}
