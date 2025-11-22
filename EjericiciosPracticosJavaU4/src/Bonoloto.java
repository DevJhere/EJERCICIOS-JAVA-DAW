import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.Scanner;

public class Bonoloto {
    /*
        Realizar el juego de bonoloto.
        Para ello el sistema contará con dos cadenas de numeros
            - numeros del sistema
            - numeros del usuario
        De primeras, el sistema guardará 5 numeros aleatorio entre 1-20
        El sistema pedira al usuario que introduzca sus numeros

        El sistema deberá decidir si he ganado un premio. Para ello los premios se reparten de la siguiente
        forma

        5 aciertos -> 1 millon de euros
        4 aciertos -> 10mil
        3 aciertos -> 1mil
        1-2 -> 10 euros
        0 -> prueba suerte la siguiente vez

        numeros del sistema -> 9,12,3,5,11
        numeros del usuario -> 12,9,6,10,3

     */

    private Scanner teclado;
    //Entrada de datos por teclado
    public Bonoloto (Scanner teclado){this.teclado = teclado;}

    //Variables Globales
    //Numeros del sistema
    private final int[] numerosSistema = new int[5];
    //Numeros del usuario
    private final int[] numerosUsuario = new int[5];

    public void generarNumerosSitema(){
        //iniciamos el array con 0
        Arrays.fill(numerosSistema,0);

        for (int i = 0; i < numerosSistema.length; i++) {
            int numeroAleatorio;

            //Comprobar unicos y validamos duplicados
            do {
                //Generamos números aleatorios entre 1 y 20
                numeroAleatorio = (int) (Math.random() * 20) + 1; // (0 entre 19) + 1
            }while (existeNumero(numerosSistema, numeroAleatorio));

            numerosSistema[i] = numeroAleatorio;
        }

        System.out.println("Números Bonoloto: " + Arrays.toString(numerosSistema));
    }

    public void pedirNumerosUsuario() {
        // Vaciamos el array del usuario antes de empezar a 0
        Arrays.fill(numerosUsuario, 0);

        //Iteramos el array para pedir los números
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numero;
            boolean esValido; //Bandera para controlar do-while
            do {
                esValido = true;
                System.out.print("Introduce un valor (1-20): ");
                numero = teclado.nextInt();

                //Validación 1:Rango
                if (numero<1 || numero>20){
                    System.out.println("Este numero no es valido");
                    esValido = false;
                }else if(existeNumero(numerosUsuario, numero)){ //Validación de duplicados
                    System.out.println("¡Ya has introducido este numero! No se puede repetir números");
                    esValido = false;
                }
            } while (!esValido);//Repetir mientras no es válido

            numerosUsuario[i] = numero;
        }
        System.out.println("Tu Bonoloto es: " + Arrays.toString(numerosUsuario));
    }

    public void comprobarBonoloto() {

        //Variable contador aciertos
        int aciertos = 0;
        //Recorremos numero Usuario
        for (int numeroUsuario : numerosUsuario){
            for (int numeroGanador : numerosSistema){ // Para cada número de usuario se recorre todos los numeros del sistema
                if (numeroGanador == numeroUsuario) {
                    aciertos++;
                    break;
                }
            }
        }
        System.out.println("Tienes " + aciertos + " aciertos.");
        calcularPremio(aciertos);// Mostramos aciertos
    }

    public void calcularPremio(int aciertos) {
        if (aciertos == 5){
            System.out.println("¡Tu premio es de 1.000.000€!");
        } else if (aciertos == 4) {
            System.out.println("¡Tu premio es de 100.000€!");
        }else if (aciertos == 3) {
            System.out.println("¡Tu premio es de 10.000€!");
        }else if (aciertos == 2 || aciertos == 1){
            System.out.println("¡Tu premio es de 100€!");
        }else {
            System.out.println("Lo siento no tienes premio.🥲");
        }
    }

    //Meotodo para controlar los números duplicados
    public boolean existeNumero(int[] array, int numeroBuscado) {
        //Metodo para comprobar duplicados
        //Devuelve true si ya está ocupado ese numero y false si aún esta libre
        for (int numero : array){
            if (numero == numeroBuscado){
                return true; //Es un duplicado
            }
        }

        return false; // Aún no existe este número
    }
}
