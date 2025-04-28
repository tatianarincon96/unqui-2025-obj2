package correo;

public interface ICorreo {
    void borrarCorreo(Correo correo);
    int contarBorrados();
    int contarInbox();
    void eliminarBorrado(Correo correo);
}
