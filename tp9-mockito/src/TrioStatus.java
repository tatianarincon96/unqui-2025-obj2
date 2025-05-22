import java.util.HashMap;
import java.util.Map;

public class TrioStatus implements Verificable {
    public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        Map<String, Integer> contador = new HashMap<>();
        String[] cartas = {carta1.getValor(), carta2.getValor(), carta3.getValor(), carta4.getValor(), carta5.getValor()};
        return checkTrio(cartas, contador);
    }

    private String checkTrio(String[] cartas, Map<String, Integer> contador) {
        for (String carta : cartas) {
            if (contador.containsKey(carta)) {
                contador.put(carta, contador.get(carta) + 1);
            } else {
                contador.put(carta, 1);
            }
        }
        if (contador.containsValue(3)) {
            return "Trio";
        } else {
            return "Nada";
        }
    }
}
