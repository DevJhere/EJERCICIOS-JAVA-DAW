package ejercicio5;

public class Desarrollador extends Empleado{
    //Atributos propios
    private String lenguajePrincipal;

    //Constructor
    public Desarrollador(){
        super();
    }

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    //Getters and Setters
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    //Funcionalidades
    public void mostrarInformacion(){
        System.out.println("------ FICHA EMPLEADO ------");
        System.out.printf("""
                Empleado: %s
                Puesto: Desarrollador
                Salario Base: %.2f€
                Lenguaje Principal: %s
                """, getNombre(), getSalarioBase(), getLenguajePrincipal());
    }
}
