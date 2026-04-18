package juego;

import juego.criaturas.*;

public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Draco", 100, 20);

        dragon.volar();
        dragon.aterrizar();
    }
}
