package ejercicio5;

public class Gerente extends Empleado{
    //Atributos propios
    private double bonus;

    //Constructor
    public Gerente() {
        super();
    }

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    //Getters and Setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Funcionalidades - Métodos
    public double calcularSalarioTotal(){
        return  this.bonus + getSalarioBase();
    }

    public void mostrarInformacion(){
        System.out.println("------ FICHA GERENTE -----");
        System.out.printf("""
                Nombre: %s
                Puesto: Gerente
                Salario Base: %.2f€
                Bonus: %.2f€
                Salario Total: %.2f€
                """, getNombre(), getSalarioBase(), getBonus(), calcularSalarioTotal());
    }
}
