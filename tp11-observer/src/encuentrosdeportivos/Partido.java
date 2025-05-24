package encuentrosdeportivos;

import java.util.List;

public class Partido {
    private String resultado;
    private List<String> contrincantes;
    private String deporte;

    public Partido(String resultado, List<String> contrincantes, String deporte) {
        this.resultado = resultado;
        this.contrincantes = contrincantes;
        this.deporte = deporte;
    }

    public String getResultado() { return resultado; }
    public List<String> getContrincantes() { return contrincantes; }
    public String getDeporte() { return deporte; }
}
