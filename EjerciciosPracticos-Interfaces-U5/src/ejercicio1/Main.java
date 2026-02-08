package ejercicio1;

import ejercicio1.Model.*;

import java.util.ArrayList;

public class Main {
        /*
        *Escenario: Tenemos animales. Todos comen y duermen (Herencia). Pero algunos vuelan, otros nadan, y otros cazan.
        *  Un pato vuela y nada. Un águila vuela y caza.
        * */
    public static void main(String[] args) {

        System.out.println("----- MUNDO ANIMAL -----");

        //Instanciamos Animal -> Pato y Tiburon
        Pato lucas = new Pato("Lucas");
        Tiburon bruce = new Tiburon("Bruce");
        Murcielago batman = new Murcielago("Batman");

        //Lista Génerica de Animales
        ArrayList<Animal> zoologico = new ArrayList<>();

        //Añadimos animales a la lista
        zoologico.add(lucas);
        zoologico.add(bruce);
        zoologico.add(batman);

        System.out.println("REVISION: ");

        for (Animal animal: zoologico){
            System.out.println("\nRevision de: " + animal.getNombre());

            //Comer
            animal.comer();

            if (animal instanceof Volador v){
                v.volador();
            }else {
                Cazador c = (Cazador) animal;
                c.cazador();
            }
        }
        //Comportamiento de Animal (Herencia)
        lucas.dormir();
        bruce.comer();

        System.out.println("\n--- HABILIDADES ---");

        // Comportamiento de Interfaces
        lucas.volador();
        lucas.nadador(); // Lucas puede nadar

        bruce.nadador(); // Bruce también puede nadar
        bruce.cazador();

        batman.comer();
        batman.cazador();
        batman.volador();
        //bruce.volador(); // ¡Error! Un tiburón no implementa "Volador"
    }
}
