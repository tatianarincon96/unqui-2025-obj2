package encriptacion.strategy;

public class VowelEncripter implements Encripter {
    @Override
    public String encriptar(String texto) {
        StringBuilder result = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'a':
                case 'A':
                    result.append('e');
                    break;
                case 'e':
                case 'E':
                    result.append('i');
                    break;
                case 'i':
                case 'I':
                    result.append('o');
                    break;
                case 'o':
                case 'O':
                    result.append('u');
                    break;
                case 'u':
                case 'U':
                    result.append('a');
                    break;
                default:
                    result.append(c);
            }
        }
        return result.toString();
    }

    @Override
    public String desencriptar(String texto) {
        StringBuilder result = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'u':
                    result.append('o');
                    break;
                case 'a':
                    result.append('u');
                    break;
                case 'e':
                    result.append('a');
                    break;
                case 'i':
                    result.append('e');
                    break;
                case 'o':
                    result.append('i');
                    break;
                default:
                    result.append(c);
            }
        }
        return result.toString();
    }
}
