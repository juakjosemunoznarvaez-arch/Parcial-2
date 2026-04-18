package juego;

import juego.criaturas.*;

import juego.armas.Arma;


public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Draco", 100, 20);


        dragon.volar();
        dragon.aterrizar();

        Mago mago = new Mago("Mago", 80, 15); // 👈 AQUÍ CAMBIAS EL NOMBRE
        Guerrero guerrero = new Guerrero("Guerrero", 120, 25, new Arma("Espada", 10));

        // Dragón
        dragon.volar();
        dragon.aterrizar();

        // Mago
        mago.lanzarHechizo();
        mago.aprenderHechizo();

        // Combate
        dragon.atacar(mago);
        guerrero.atacar(dragon);

    }
}
