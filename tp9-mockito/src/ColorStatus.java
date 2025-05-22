public class ColorStatus implements Verificable {
    public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        String[] colors = {carta1.getPalo(), carta2.getPalo(), carta3.getPalo(), carta4.getPalo(), carta5.getPalo()};
        return checkColor(colors);
    }

    private String checkColor(String[] colors) {
        if (colors[0].equals(colors[1]) && colors[0].equals(colors[2]) && colors[0].equals(colors[3]) && colors[0].equals(colors[4])) {
            return "Color";
        } else {
            return "Nada";
        }
    }
}
