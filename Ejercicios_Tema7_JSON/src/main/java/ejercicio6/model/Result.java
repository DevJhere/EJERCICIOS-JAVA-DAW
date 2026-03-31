package ejercicio6.model;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Result {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    @SerializedName("correct_answer")
    private String correctAnswer;
    private List<String> incorrectAnswers;


    public void mostrarPreguntaLimpia(){

        // 1. Limpiamos la pregunta encadenando varios .replace()
        String preguntaLimpia = this.question
                .replace("&quot;", "\"")   // Cambia &quot; por comillas dobles
                .replace("&#039;", "'")    // Cambia &#039; por comillas simples
                .replace("&amp;", "&")     // Cambia &amp; por el símbolo &
                .replace("&shy;", "");     // Elimina guiones invisibles


        // 2. Limpiamos la respuesta por si acaso también viene sucia
        String respuestaLimpia = this.correctAnswer
                .replace("&quot;", "\"")
                .replace("&#039;", "'")
                .replace("&amp;", "&");


        // 3. Imprimimos por consola el resultado final impecable
        System.out.println("📚 Categoría: " + this.category);
        System.out.println("❓ Pregunta: " + preguntaLimpia);
        System.out.println("✅ Respuesta correcta: " + respuestaLimpia);
        System.out.println("--------------------------------------------------");
    }
}