package juego.armas;

import juego.criaturas.Criatura;

public class Arma {
    private int dañoAdicional;

    public Arma(int dañoAdicional) {
        this.dañoAdicional = dañoAdicional;
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }

    public void atacarConArma(Criatura objetivo) {
        objetivo.defender(dañoAdicional);
    }
}