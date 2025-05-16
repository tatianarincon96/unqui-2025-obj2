package cultivos;

public abstract class Region implements Cultivable {
    private Cultivable[] parcelas;

    public Cultivable[] getParcelas() {
        return parcelas;
    }

    public Region() {
        this.parcelas = new Cultivable[4];
    }
}
