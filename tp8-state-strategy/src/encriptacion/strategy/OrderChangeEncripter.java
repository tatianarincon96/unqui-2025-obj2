package encriptacion.strategy;

public class OrderChangeEncripter implements Encripter {
    @Override
    public String encriptar(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]).append(" ");
        }
        return resultado.toString().trim();
    }

    @Override
    public String desencriptar(String texto) {
        return encriptar(texto);
    }
}
