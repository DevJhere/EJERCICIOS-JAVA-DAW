package ejercicio1;

public class Gato extends Animal{
    //Atributo
    private String especialidad;

    //Constructores
    public Gato(String especialidad) {
        this.especialidad = especialidad;
    }

    public Gato(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    //Getters and Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Funcionalidades

    @Override
    public void hacerSonido() {
        String sonido = "Miau Miau";
        System.out.println(this.getNombre() + " hace " + sonido);
        System.out.println("Especialidad: " + this.especialidad);
    }
}
