package juego.armas;

public class Arma {

    private String nombre;
    private int danioAdicional;

    public Arma(String nombre, int danioAdicional) {
        this.nombre = nombre;
        this.danioAdicional = danioAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanioAdicional() {
        return danioAdicional;
    }

    public void usar() {
        System.out.println("Usando arma: " + nombre);
    }
}