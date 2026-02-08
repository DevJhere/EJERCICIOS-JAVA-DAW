import controller.Hospital;
import model.Medico;
import model.Paciente;

public class Main {

    public static void main(String[] args) {


        //Instanciamos
        Hospital hospital = new Hospital();

        Paciente p1 = new Paciente("Pepe",101,30, "Gripe");
        Paciente p2 = new Paciente("Luis",102,40, "Fiebre");
        Paciente p3 = new Paciente("Pedro",103,20, "Migrañas");
        Medico m1 = new Medico("Martin", 401, 25, "Médico Familia");
        p1.mostrarFicha();

        hospital.registrarPersona(p1);
        hospital.registrarPersona(p2);
        hospital.registrarPersona(p3);
        hospital.registrarPersona(m1);
        hospital.listarPorTipo(Paciente.class);
        hospital.buscarPorNombre("Pedro");
        hospital.eliminarPersona(201);
        hospital.listarTodo();


    }
}
