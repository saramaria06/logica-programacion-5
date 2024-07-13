import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class diccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés con al menos 20 palabras
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("por favor", "please");
        diccionario.put("gracias", "thank you");
        diccionario.put("perdón", "sorry");
        diccionario.put("sí", "yes");
        diccionario.put("no", "no");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("escuela", "school");
        diccionario.put("trabajo", "work");
        diccionario.put("casa", "house");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("aire", "air");
        diccionario.put("tierra", "earth");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");

        // Crear una lista de las palabras en español
        ArrayList<String> palabrasEnEspanol = new ArrayList<>(diccionario.keySet());

        // Barajar las palabras y seleccionar las primeras 5
        Collections.shuffle(palabrasEnEspanol);
        ArrayList<String> palabrasSeleccionadas = new ArrayList<>(palabrasEnEspanol.subList(0, 5));

        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int correctas = 0;
        int incorrectas = 0;

        // Pedir al usuario la traducción de las palabras seleccionadas
        for (String palabra : palabrasSeleccionadas) {
            System.out.println("¿Cuál es la traducción al inglés de: " + palabra + "?");
            String respuesta = scanner.nextLine();

            if (diccionario.get(palabra).equalsIgnoreCase(respuesta)) {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        // Mostrar los resultados
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}

