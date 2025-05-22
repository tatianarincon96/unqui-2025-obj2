public class PokerGame implements Verificable {
    private Verificable[] verificadores;

    public PokerGame() {
        verificadores = new Verificable[]{
            new PoquerStatus(),
            new ColorStatus(),
            new TrioStatus()
        };
    }

    public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        for (Verificable verificable : verificadores) {
            String resultado = verificable.verificar(carta1, carta2, carta3, carta4, carta5);
            if (!resultado.equals("Nada")) {
                return resultado;
            }
        }
        return "Nada";
    }
}
