package encriptacion.strategy;

public class EncriptadorNaive {

    private Encripter encripter;

    public EncriptadorNaive(Encripter encripter) {
        this.encripter = encripter;
    }

    public void setEncripter(Encripter encripter) {
        this.encripter = encripter;
    }

    public String encriptar(String texto) {
        return encripter.encriptar(texto);
    }

    public String desencriptar(String texto) {
        return encripter.desencriptar(texto);
    }

}
