public class Numero {
    private int numero;

    // Realmente no hace falta ponerlo, los integer se construyen con 0 by default
    public Numero() {
        numero = 0;
    }

    public int getValor() {
        return numero;
    }
    public Numero (int numero) {
        this.numero = numero;
    }

    public void suma(int n) {
        numero += n;
    }

    public void resta(int n) {
        numero -= n;
    }

    public int getDoble() {
        return numero*2;
    }

    public void setNum(int n) {
        numero = n;
    }

    public String toString() {
        return "Número: " + numero;
    }

}
