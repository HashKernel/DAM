package Dados;

public class Jugador {
    private final String nombre;
    private Dado dado1; // Generamos dos dados (objeto) para cada jugador
    private Dado dado2;
    public Jugador (String nombre) {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.nombre = nombre;
    }

    public void tirar() { // Cada vez que el usuario ejecuta el método tirar, se cambia el valor de cada objeto
        dado1.setDado((int) (Math.random() * 6) +1);
        dado2.setDado((int) (Math.random() * 6) +1);

        System.out.println("Primer dado: " + dado1.getDado());
        System.out.println("Segundo dado: " + dado2.getDado());
        System.out.println();


    }

    // CONDICIONES
    public boolean tieneDosSeis() {
        if (dado1.getDado() == 6 && dado2.getDado() == 6)
            return true;
        return false;
    }

    public boolean tieneUnSeis() {
        if (dado1.getDado() == 6 || dado2.getDado() == 6) {
            return true;
        }
        return false;
    }

    public int noTieneSeises() {
        return dado1.getDado() + dado2.getDado();
    }

    public String getJugador() {
        return this.nombre;
    }
}
