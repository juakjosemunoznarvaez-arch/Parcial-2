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
        int daño = fuerza + arma.getDañoAdicional();
        System.out.println(nombre + " ataca con espada ⚔️");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }
}