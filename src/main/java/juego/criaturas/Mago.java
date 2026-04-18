package juego.criaturas;

import juego.interfaces.Magico;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danio = fuerza + 5;
        System.out.println(nombre + " lanza hechizo");
        objetivo.defender(danio);
    }

    @Override
    public void defender(int danio) {
        salud -= danio;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " usa magia");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende hechizo");
    }
}
