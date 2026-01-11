package ejercicio1;

public class Perro extends Animal{
    //Atributos no comunes
    private String especialidad;

    //Constructor
    public Perro(String especialidad) {
        this.especialidad = especialidad;
    }

    public Perro(String nombre, int edad, String especialidad) {
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
        String sonido = "Gua Gua";
        System.out.println(this.getNombre() + " hace " + sonido);
        System.out.println("Especialidad: " + this.especialidad);
    }
}
