package FileSystem;

import java.time.LocalDate;

public class Archivo implements FileSystem {
    private String nombre;
    private int espacioDiscoDuro;
    private LocalDate fechaUltimaModi;

    public Archivo(String nombre, int espacioDiscoDuro, LocalDate fechaUltimaModi) {
        this.nombre = nombre;
        this.espacioDiscoDuro = espacioDiscoDuro;
        this.fechaUltimaModi = fechaUltimaModi;
    }

    @Override
    public int totalSize() {
        return espacioDiscoDuro;
    }

    @Override
    public void printStructure() {
        System.out.println("Archivo: " + nombre + ", Size: " + espacioDiscoDuro + ", Fecha de Creación: " + fechaUltimaModi);
    }

    @Override
    public FileSystem lastModified() {
        return this; // Asumiendo que el archivo es el último modificado
    }

    @Override
    public FileSystem oldestElement() {
        return this; // Asumiendo que el archivo es el más antiguo
    }
}
