package publicaciones;

import java.util.List;

public class Articulo {
    private String titulo;
    private List<String> autores;
    private List<String> filiaciones;
    private String tipo;
    private String lugarPublicacion;
    private List<String> palabrasClave;

    public Articulo(String titulo, List<String> autores, List<String> filiaciones, String tipo, String lugarPublicacion, List<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.filiaciones = filiaciones;
        this.tipo = tipo;
        this.lugarPublicacion = lugarPublicacion;
        this.palabrasClave = palabrasClave;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public List<String> getAutores() { return autores; }
    public List<String> getFiliaciones() { return filiaciones; }
    public String getTipo() { return tipo; }
    public String getLugarPublicacion() { return lugarPublicacion; }
    public List<String> getPalabrasClave() { return palabrasClave; }
}