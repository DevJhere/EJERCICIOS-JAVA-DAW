package ejercicio2.model;

// Product.java
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Producto {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;

    public void mostrarInformacion(){
        System.out.printf("""
                ID: %d
                Titulo: %s
                Precio: %.2f
                """, getId(), getTitle(), getPrice());
    }
}