package juego.criaturas;

import juego.interfaces.Volador;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        System.out.println(nombre + " lanza fuego");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    public void volar() {
        System.out.println(nombre + " está volando");
    }

  
    public void aterrizar() {
        System.out.println(nombre + " aterriza");
    }
}
