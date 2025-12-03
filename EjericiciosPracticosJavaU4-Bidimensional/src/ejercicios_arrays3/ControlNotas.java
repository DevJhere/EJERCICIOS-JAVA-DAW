package ejercicios_arrays3;

import java.util.Scanner;

public class ControlNotas {

    private double[] notasAlumno = new double[10];
    private Scanner teclado;

    //---Metodos Auxiliares-----
    //Resgistrar notas de Alumnos
    public void registrarNotasAlumnos(){
        teclado = new Scanner(System.in);

        System.out.println("---Registro de Notas----");

        for (int i = 0; i < notasAlumno.length; i++) {
            double notaIntroducida;
            //Validación de datos
            do {
                System.out.printf("Introduce nota de alumno %d (0-10): ", (i+1));
                notaIntroducida = teclado.nextDouble();

                if (notaIntroducida < 0 || notaIntroducida > 10){
                    System.out.println("Error. Nota no válida");
                }
            }while (notaIntroducida<0 || notaIntroducida > 10);
            notasAlumno[i] = notaIntroducida;
        }
    }

    //Mostrar Informe
    //Calcular Nota Media de la Clase
    public void mostrarInforme () {

       //Variables locales para realizar el cálculo
        double suma = 0;
        double notaMax = notasAlumno[0], notaMin = notasAlumno[0];
        int aprobados = 0;
        int suspendidos = 0;

        for (double nota : notasAlumno) {
            //Calculamos suma de las notas
            suma += nota;
            //Calculamos Max y Min nota
            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }

            //Calculamos aprobados y suspensos
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }

        double media = suma / notasAlumno.length;

        //Imprimimos Resultados
        System.out.println("------ Informe Final -------");
        System.out.printf("i.   Nota Media: %.2f%n", media);
        System.out.println("ii.  Nota Más Alta: " + notaMax);
        System.out.println("     Nota Más Baja: " + notaMin);
        System.out.println("iii. Aprobados: " + aprobados);
        System.out.println("     Suspendidos: " + suspendidos);
    }
}
