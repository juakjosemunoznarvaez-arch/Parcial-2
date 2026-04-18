package juego.criaturas;

import juego.interfaces.Magico;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza un hechizo");
        objetivo.defender(fuerza);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " usa magia");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un hechizo");
    }
}