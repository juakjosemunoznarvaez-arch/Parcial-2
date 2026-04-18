package juego;

import juego.armas.Arma;
import juego.criaturas.*;

public class Main {

    public static void main(String[] args) {

        Arma espada = new Arma(10);

        Dragon dragon = new Dragon("Draco", 100, 20);
        Guerrero guerrero = new Guerrero("Guerrero", 120, 25, espada);

        simularBatalla(dragon, guerrero);
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {

        System.out.println("🔥 INICIA LA BATALLA 🔥");

        while (c1.estaViva() && c2.estaViva()) {

            System.out.println("\n" + c1.getNombre() + " ataca!");
            c1.atacar(c2);
            System.out.println(c2.getNombre() + " salud: " + c2.getSalud());

            if (!c2.estaViva()) break;

            System.out.println(c2.getNombre() + " ataca!");
            c2.atacar(c1);
            System.out.println(c1.getNombre() + " salud: " + c1.getSalud());
        }

        System.out.println("\n🏆 GANADOR: " +
                (c1.estaViva() ? c1.getNombre() : c2.getNombre()));
    }
}