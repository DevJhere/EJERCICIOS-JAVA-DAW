package ejercicio5;

public class CuentaBancaria {

    //Atributos
    private String titular;
    private double saldo;

    //Constructores
    public CuentaBancaria(){
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodos Auxiliares
    public double depositarCantidad(double deposito){
        return this.saldo += deposito;
    }

    public double retirarCantidad(double retiro){
        return this.saldo -= retiro;
    }
}
