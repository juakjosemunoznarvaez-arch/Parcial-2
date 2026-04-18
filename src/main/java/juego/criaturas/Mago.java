package juego.criaturas;

import juego.interfaces.Magico;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        int danio = fuerza + 10;
        System.out.println(nombre + " lanza hechizo");
        objetivo.defender(danio);
    }

    public void defender(int danio) {
        salud -= danio;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo poderoso");
    }

    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo");
    }
}
