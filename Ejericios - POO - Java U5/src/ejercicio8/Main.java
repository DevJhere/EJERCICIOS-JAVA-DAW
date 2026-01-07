package ejercicio8;

public class Main {
    /*Crea una clase Empleado con atributos nombre, puesto y salario. En el método main, crea un array de 5 empleados,
     *inicialízalos con datos y luego muestra: todos los empleados, el empleado con mayor salario y el salario promedio.
     * */
    public static void main(String[] args) {

        //Instanciamos objeto Empleado como una lista
        Empleado[] listaEmpleados = new Empleado[5];

        //Agregamos información a la lista de Empleados
        listaEmpleados[0] = new Empleado("Ana Pérez", "Desarrolladora", 35000);
        listaEmpleados[1] = new Empleado("Luis García", "Diseñador", 28000);
        listaEmpleados[2] = new Empleado("María Torres", "Project Manager", 42000);
        listaEmpleados[3] = new Empleado("Jorge Díaz", "Analista", 32000);
        listaEmpleados[4] = new Empleado("Laura Sanchez", "Tester", 26000);

        //Empleado con mayor salario
        //Variable Auxiliar, controlar el salario Maximo dentro de la lista de empleados.
        Empleado empleadoMasSalario = listaEmpleados[0];

        //Salario Promedio
        double sumaSalarios = 0;

        System.out.println("Lista de empleados: ");

        //Mostramos Datos Empleados
        for (int i = 0; i < listaEmpleados.length; i++) {
            //Imprimimos datos
            System.out.println((i+1) + ". " + listaEmpleados[i]);

            if (empleadoMasSalario.getSalario() < listaEmpleados[i].getSalario()) {
                empleadoMasSalario = listaEmpleados[i];
            }

            //Sumamos salarios
            sumaSalarios += listaEmpleados[i].getSalario();
        }


        //Calculamos Promedio
        double salarioPromedio =  sumaSalarios/ listaEmpleados.length;

        System.out.println();

        System.out.println("Empleado con salario mayor es: " + empleadoMasSalario.getNombre() + " ("+ empleadoMasSalario.getSalario() + "€)");
        System.out.println("Salario promedio: " + salarioPromedio + "€");


    }
}
