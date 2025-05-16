package cultivos;

public class RegionPura extends Region {
    public void agregarCultivo(Cultivo cultivo) {
        for (int i = 0; i < getParcelas().length; i++) {
            if (getParcelas()[i] == null) {
                getParcelas()[i] = cultivo;
                return;
            }
        }
        System.out.println("No hay espacio para agregar más cultivos.");
    }

    @Override
    public double calcularGananciasAnuales() {
        double totalGanancias = 0;
        for (Cultivable parcela : getParcelas()) {
            totalGanancias += parcela.calcularGananciasAnuales();
        }
        return totalGanancias;
    }
}
