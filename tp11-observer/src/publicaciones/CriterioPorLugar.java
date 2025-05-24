package publicaciones;

public class CriterioPorLugar implements CriterioSuscripcion {
    private String lugar;

    public CriterioPorLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean cumple(Articulo articulo) {
        return articulo.getLugarPublicacion().equalsIgnoreCase(lugar);
    }
}