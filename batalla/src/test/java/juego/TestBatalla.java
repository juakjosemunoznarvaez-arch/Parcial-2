package juego;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import juego.armas.Arma;
import juego.criaturas.Guerrero;

public class TestBatalla {

    @Test
    public void testEstaViva() {
        Guerrero g = new Guerrero("A", 100, 20, new Arma(10));
        assertTrue(g.estaViva());
    }

    @Test
    public void testDefensa() {
        Guerrero g = new Guerrero("A", 100, 20, new Arma(10));
        g.defender(30);
        assertTrue(g.getSalud() == 70);
    }
}