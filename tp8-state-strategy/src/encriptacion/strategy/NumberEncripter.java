package encriptacion.strategy;

import java.util.Map;

public class NumberEncripter implements Encripter {

    private static final Map<Character, Integer> NUMBERS = Map.ofEntries(
            Map.entry(' ', 0),
            Map.entry('a', 1),
            Map.entry('b', 2),
            Map.entry('c', 3),
            Map.entry('d', 4),
            Map.entry('e', 5),
            Map.entry('f', 6),
            Map.entry('g', 7),
            Map.entry('h', 8),
            Map.entry('i', 9),
            Map.entry('j', 10),
            Map.entry('k', 11),
            Map.entry('l', 12),
            Map.entry('m', 13),
            Map.entry('n', 14),
            Map.entry('ñ', 15),
            Map.entry('o', 16),
            Map.entry('p', 17),
            Map.entry('q', 18),
            Map.entry('r', 19),
            Map.entry('s', 20),
            Map.entry('t', 21),
            Map.entry('u', 22),
            Map.entry('v', 23),
            Map.entry('w', 24),
            Map.entry('x', 25),
            Map.entry('y', 26),
            Map.entry('z', 27)
    );

    @Override
    public String encriptar(String texto) {
        StringBuilder result = new StringBuilder();
        for (char c : texto.toCharArray()) {
            int numero = NUMBERS.get(Character.toLowerCase(c));
            result.append(numero);
            result.append(",");
        }
        return result.toString().replaceAll(",$", "");
    }

    @Override
    public String desencriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (String numero : texto.split(",")) {
            if (numero.isEmpty()) {
                continue;
            }
            int num = Integer.parseInt(numero);
            for (Map.Entry<Character, Integer> entry : NUMBERS.entrySet()) {
                if (entry.getValue() == num) {
                    resultado.append(entry.getKey());
                    break;
                }
            }
        }
        return resultado.toString();
    }
}
