package Dados;

public class Dado {
    private int dado;

    public Dado(){ // Realmente aunque no hubiese constructor seguiría funcionando ya que sería 0, pero se lo cambiaremos a posterior
        this.dado = (int) (Math.random()*6+1);
    }

    public int getDado() { // Devolver el valor del atributo
        return dado;
    }

    public void setDado(int num) { // Cambiar el valor del atributo
        this.dado = (int) (Math.random()*6+1);
    }
}
