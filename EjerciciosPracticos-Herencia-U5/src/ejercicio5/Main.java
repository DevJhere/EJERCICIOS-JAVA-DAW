package ejercicio5;

public class Main {
    /*
    Crea una clase Empleado con atributos nombre y salarioBase. Crea dos clases hijas: Gerente (con atributo bonus) y
    Desarrollador (con atributo lenguajePrincipal). Implementa un método calcularSalarioTotal() en Gerente que sume el bonus
    al salario base. Crea objetos de ambos tipos y muestra su información completa.
    */
    public static void main(String[] args) {
        //Instanciamos Gerente y Desarrollador
        Gerente gerente1 = new Gerente("Ana Garcia", 3500, 1000);
        Desarrollador desarrollador1 = new Desarrollador("Luis Martinez", 2000, "JAVA");

        //Aplicamos funcionalidades
        gerente1.mostrarInformacion();

        System.out.println();

        desarrollador1.mostrarInformacion();
    }
}
