package cultivos;

public class RegionMixta extends Region {
    public void agregarCultivo(Region region) {
        for (int i = 0; i < getParcelas().length; i++) {
            if (getParcelas()[i] == null) {
                getParcelas()[i] = region;
                return;
            }
        }
        System.out.println("No hay espacio para agregar más regiones.");
    }

    @Override
    public double calcularGananciasAnuales() {
        double totalGanancias = 0;
        for (Cultivable parcela : getParcelas()) {
            totalGanancias += parcela.calcularGananciasAnuales() / 4;
        }
        return totalGanancias;
    }
}
