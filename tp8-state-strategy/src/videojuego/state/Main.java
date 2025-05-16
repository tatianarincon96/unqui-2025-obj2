package videojuego.state;

public class Main {
    public static void main(String[] args) {
        MaquinaVideoJuegos maquina = new MaquinaVideoJuegos();
        maquina.prender();
        maquina.iniciar(); // -- No se puede iniciar el juego sin fichas
        maquina.insertarFicha(new Ficha());
        maquina.iniciar(); // -- Se inicia el juego con una ficha
        maquina.finalizar();
        maquina.insertarFicha(new Ficha());
        maquina.iniciar(); // -- Se inicia el juego con una ficha
        maquina.insertarFicha(new Ficha());
        maquina.iniciar(); // -- Se inicia el juego con dos fichas
        maquina.apagar();
    }
}
