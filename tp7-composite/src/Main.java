import cultivos.Parcela;
import cultivos.Soja;
import cultivos.Trigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear cultivos
        Soja soja = new Soja();
        Trigo trigo = new Trigo();

        // Crear parcelas de parcela3
        Parcela parcela3_1 = new Parcela(soja, soja, soja, soja);
        Parcela parcela3_2 = new Parcela(soja, soja, soja, soja);
        Parcela parcela3_3 = new Parcela(trigo, trigo, trigo, trigo);
        Parcela parcela3_4 = new Parcela(trigo, trigo, trigo, trigo);

        // Crear parcelas
        Parcela parcela1 = new Parcela(soja, soja, soja, soja);
        Parcela parcela2 = new Parcela(trigo, trigo, trigo, trigo);
        Parcela parcela3 = new Parcela(parcela3_1, parcela3_2, parcela3_3, parcela3_4);
        Parcela parcela4 = new Parcela(soja, soja, soja, soja);

        // Crear parcela general
        Parcela parcelaGeneral = new Parcela(parcela1, parcela2, parcela3, parcela4);

        System.out.println("Ganancias anuales de la parcela 1: " + parcela1.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la parcela 2: " + parcela2.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la parcela 3: " + parcela3.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la parcela 4: " + parcela4.calcularGananciasAnuales());
        System.out.println("Ganancias anuales de la parcela general: " + parcelaGeneral.calcularGananciasAnuales());
    }
}