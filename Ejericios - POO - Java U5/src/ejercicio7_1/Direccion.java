package ejercicio7_1;

public class Direccion {

    //Atributos
    private String calle, ciudad;
    private int codigoPostal;

    //Constructor
    public Direccion() {

    }

    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    //Getters and Setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Calle " + calle + ", " + ciudad + ", " + codigoPostal;
    }
}
