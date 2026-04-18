package juego;

import juego.criaturas.Criatura;

public class Batalla {

    public static void simularBatalla(Criatura c1, Criatura c2) {

        System.out.println("🔥 INICIA LA BATALLA 🔥");

        int turno = 1;

        while (c1.estaViva() && c2.estaViva()) {

            System.out.println("\n--- TURNO " + turno + " ---");

            System.out.println(c1.getNombre() + " ataca!");
            c1.atacar(c2);
            System.out.println(c2.getNombre() + " salud: " + c2.getSalud());

            if (!c2.estaViva()) break;

            System.out.println(c2.getNombre() + " ataca!");
            c2.atacar(c1);
            System.out.println(c1.getNombre() + " salud: " + c1.getSalud());

            turno++;
        }

        System.out.println("\n🏆 GANADOR: " +
                (c1.estaViva() ? c1.getNombre() : c2.getNombre()));
    }
}