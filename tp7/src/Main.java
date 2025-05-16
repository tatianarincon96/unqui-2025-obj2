import cultivos.RegionMixta;
import cultivos.RegionPura;
import cultivos.Soja;
import cultivos.Trigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RegionPura regionPura1 = new RegionPura();
        regionPura1.agregarCultivo(new Soja());

        RegionPura regionPura2 = new RegionPura();
        regionPura2.agregarCultivo(new Trigo());

        RegionMixta regionMixta3 = new RegionMixta();
        regionMixta3.agregarCultivo(regionPura1);
        regionMixta3.agregarCultivo(regionPura1);
        regionMixta3.agregarCultivo(regionPura2);
        regionMixta3.agregarCultivo(regionPura2);

        RegionPura regionPura4 = new RegionPura();
        regionPura4.agregarCultivo(new Soja());

        RegionMixta regionMixta = new RegionMixta();
        regionMixta.agregarCultivo(regionPura1);
        regionMixta.agregarCultivo(regionPura2);
        regionMixta.agregarCultivo(regionMixta3);
        regionMixta.agregarCultivo(regionPura4);

        System.out.println("Ganancias anuales de la región pura 1: " + regionPura1.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la región pura 2: " + regionPura2.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la región mixta 3: " + regionMixta3.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la región pura 4: " + regionPura4.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la región mixta total: " + regionMixta.calcularGananciasAnuales());
    }
}