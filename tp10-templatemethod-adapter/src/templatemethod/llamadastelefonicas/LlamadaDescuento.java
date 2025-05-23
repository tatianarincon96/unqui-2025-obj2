package templatemethod.llamadastelefonicas;

public class LlamadaDescuento extends LlamadaTelefonica {
    public LlamadaDescuento(int tiempo, int horaDelDia) {
        super(tiempo, horaDelDia);
    }
    @Override
    public boolean esHoraPico() {
        return false;
    }
    @Override
    public float costoNeto(){
        return this.getTiempo()*0.95f;
    }
}
