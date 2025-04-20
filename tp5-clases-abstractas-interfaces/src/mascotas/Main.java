package mascotas;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", LocalDate.of(1990, 12, 12));
        Persona persona2 = new Persona("Ana", LocalDate.of(1995, 10, 10));
        Mascota mascota = new Mascota("Firulais", "Golden");
        Mascota mascota2 = new Mascota("Luna", "Poodle");

        // Polimorfismo, se usa la clase genérica Object y por eso puedo agregarlos a la misma colleción
        // Pero para instanciar su nombre, si no hay clase genérica que defina el
        // metodo getName() , no puedo imprimirlo directamente
        List<SerVivo> lista = List.of(persona, persona2, mascota, mascota2);

        for (SerVivo object: lista) {
            System.out.println("Objeto: " + object.getNombre());
        }

        // Si no puedo por herencia, puedo asegurarme de que los objetos respondan al mismo mensaje
        // definiendo una interfaz que sea común a ambos
    }
}
