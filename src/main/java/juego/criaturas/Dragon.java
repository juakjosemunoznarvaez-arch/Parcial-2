package juego.criaturas;

import juego.interfaces.Volador;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        int danio = fuerza * 2;
        System.out.println(nombre + " lanza fuego");
        objetivo.defender(danio);
    }

    public void defender(int danio) {
        salud -= danio;
    }

    public void volar() {
        System.out.println(nombre + " vuela");
    }

    public void aterrizar() {
        System.out.println(nombre + " aterriza");
    }
}
