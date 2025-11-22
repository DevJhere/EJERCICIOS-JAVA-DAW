import java.util.Scanner;

public class MainBonoloto {
    public static void main(String[] args) {

        //Instanciamos Objeto Bonoloto
        Scanner teclado = new Scanner(System.in);
        Bonoloto bonoloto = new Bonoloto(teclado);

        bonoloto.pedirNumerosUsuario();
        bonoloto.generarNumerosSitema();
        bonoloto.comprobarBonoloto();

        teclado.close();
    }
}
