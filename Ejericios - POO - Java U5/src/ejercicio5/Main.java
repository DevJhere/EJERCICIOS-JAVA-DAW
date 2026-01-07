package ejercicio5;

public class Main {
    /*Crea una clase CuentaBancaria con atributos titular y saldo. Implementa métodos depositar(cantidad) y retirar(cantidad).
    Crea tres cuentas diferentes, realiza varias operaciones en cada una y muestra el saldo final de todas.*/

    public static void main(String[] args) {

        //Creación de objetos
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Garcia", 1500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Pepe Lopez", 800.0);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro Martín", 1200);

        //Cuenta Juan Garcia
        System.out.println("Cuenta de " + cuenta1.getTitular() + ": "+ cuenta1.getSaldo() + "€");
        System.out.println("Deposito de 500.0€. Nuevo saldo: " + cuenta1.depositarCantidad(500) + "€");
        System.out.println();

        //Cuenta Pepe Lopez
        System.out.println("Cuenta de " + cuenta2.getTitular() + ": "+ cuenta2.getSaldo() + "€");
        System.out.println("Retiro de 200.0€. Nuevo saldo: " + cuenta2.retirarCantidad(200.20) + "€");
        System.out.println();

        //Cuenta Pedro Martin
        System.out.println("Cuenta de " + cuenta3.getTitular() + ": "+ cuenta3.getSaldo() + "€");
        System.out.println("Deposito de 500.0€. Nuevo saldo: " + cuenta3.depositarCantidad(300) + "€");
        System.out.println();

        System.out.println("Saldos finales:");
        System.out.println(cuenta1.getTitular() + ": " + cuenta1.getSaldo() + "€");
        System.out.println(cuenta2.getTitular() + ": " + cuenta2.getSaldo() + "€");
        System.out.println(cuenta3.getTitular() + ": " + cuenta3.getSaldo() + "€");

    }
}
