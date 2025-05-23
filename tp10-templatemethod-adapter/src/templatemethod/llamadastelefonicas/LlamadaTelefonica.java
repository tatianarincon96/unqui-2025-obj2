package templatemethod.llamadastelefonicas;

public abstract class LlamadaTelefonica {
    private int tiempo;
    private int horaDelDia;

    public LlamadaTelefonica(int tiempo, int horaDelDia){
        this.tiempo=tiempo;
        this.horaDelDia=horaDelDia;
    }

    // Operación Concreta
    public int getTiempo(){
        return this.tiempo;
    }

    // Operación Concreta
    public int getHoraDelDia(){
        return this.horaDelDia;
    }

    // Operación Primitiva
    public abstract boolean esHoraPico();

    // Template Method
    public float costoFinal(){
        if(this.esHoraPico()){
            return this.costoNeto()*1.2f*this.getTiempo();
        }else{
            return this.costoNeto()*this.getTiempo();
        }
    }

    // Operación Primitiva
    public float costoNeto(){
        return this.getTiempo()*1;
    }

    // Hook Method:
    // En este caso, no hay un hook method explícito
    // (un metodo con implementación vacía o por defecto que puede ser
    // opcionalmente sobrescrito por subclases).
    // Si se agregara un metodo así, sería, por ejemplo,
    // un metodo protegido que las subclases pueden sobrescribir
    // para modificar el comportamiento sin ser obligatorio.
}
