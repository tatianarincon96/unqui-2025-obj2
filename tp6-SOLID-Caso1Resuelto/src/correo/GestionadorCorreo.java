package correo;

import java.util.ArrayList;
import java.util.List;

public class GestionadorCorreo implements ICorreo {
    private List<Correo> inbox;
    private List<Correo> borrados;

    public GestionadorCorreo() {
        this.inbox = new ArrayList<>();
        this.borrados = new ArrayList<>();
    }

    @Override
    public void borrarCorreo(Correo correo) {
        this.inbox.remove(correo);
        this.borrados.remove(correo);
    }

    @Override
    public int contarBorrados() {
        return this.borrados.size();
    }

    @Override
    public int contarInbox() {
        return this.inbox.size();
    }

    @Override
    public void eliminarBorrado(Correo correo) {
        this.borrados.remove(correo);
    }
}
