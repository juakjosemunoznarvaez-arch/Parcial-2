package juego.criaturas;

import juego.armas.Arma;

public class Guerrero extends Criatura {

    private Arma arma;

    public Guerrero(String nombre, int salud, int fuerza, Arma arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danio = fuerza + arma.getDanioAdicional();
        System.out.println(nombre + " ataca con " + arma.getNombre());
        objetivo.defender(danio);
    }

    @Override
    public void defender(int danio) {
        salud -= danio;
    }
}
