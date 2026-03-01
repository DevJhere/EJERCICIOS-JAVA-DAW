package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    private int id;
    private String name;
    private int height;
    private int weight;

    @Override
    public String toString() {
        return String.format("ID: %d  | Nombre: %s  | Altura: %d  | Peso: %s", getId(), getName(), getHeight(), getWeight());
    }
}
