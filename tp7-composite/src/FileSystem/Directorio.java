package FileSystem;

import java.time.LocalDate;
import java.util.List;

public class Directorio implements FileSystem {
    private String nombre;
    private LocalDate fechaCreacion;
    private List<FileSystem> contenido;

    public Directorio(String nombre, LocalDate fechaCreacion, List<FileSystem> contenido) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.contenido = contenido;
    }

    @Override
    public int totalSize() {
        int total = 0;
        for (FileSystem elemento : contenido) {
            total += elemento.totalSize();
        }
        return total;
    }

    @Override
    public void printStructure() {
        System.out.println("Directorio: " + nombre);
        System.out.println("Fecha de Creación: " + fechaCreacion);
        for (FileSystem elemento : contenido) {
            elemento.printStructure();
        }
    }

    @Override
    public FileSystem lastModified() {
        FileSystem last = this;
        for (FileSystem elemento : contenido) {
            if (elemento.lastModified().totalSize() > last.totalSize()) {
                last = elemento.lastModified();
            }
        }
        return last;
    }

    @Override
    public FileSystem oldestElement() {
        FileSystem oldest = this;
        for (FileSystem elemento : contenido) {
            if (elemento.oldestElement().totalSize() < oldest.totalSize()) {
                oldest = elemento.oldestElement();
            }
        }
        return oldest;
    }
}
