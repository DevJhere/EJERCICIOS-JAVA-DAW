package ejercicio1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Dob dob;
    private Dob registered;
    private String phone;
    private String cell;
    private ID id;
    private Picture picture;
    private String nat;

    public void mostrarDatos(){
        System.out.printf("""
                Nombre completo: %s | %s | %s
                Email: %s
                País: %s
                """, getName().getTitle(), getName().getFirst(), getName().getLast(), getEmail(), getLocation().getCountry());
    }
}
