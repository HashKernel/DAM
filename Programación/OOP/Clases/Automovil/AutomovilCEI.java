package Automovil;
public class AutomovilCEI {
    private String matricula;
    private int maxBateria;
    private String descripcion;
    private String fechaMat;
    private int nivelBateria;
    private boolean servicio;
    public AutomovilCEI(String matricula, int maxBateria, int nivelBateria){
        this.matricula = matricula;
        this.maxBateria = maxBateria;
        this.descripcion = "Coche";
        this.fechaMat = "01/01/2000";
        this.nivelBateria = nivelBateria;
        servicio = true;
    }
    public void utilizarEnergia() {
        this.nivelBateria--;
    }

    public void recargarEnergia() {
        nivelBateria++;
    }

    public int getPorcentajeBateria() {
        float porcentajeBateria = (float) nivelBateria / maxBateria * 100;
        if (porcentajeBateria > 10)
            this.servicio = true;
        else
            this.servicio = false;

        return Math.round(porcentajeBateria);
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMaxBateria() {
        return maxBateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaMat() {
        return fechaMat;
    }

    public boolean getServicio() {
        return servicio;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int num) {
        this.nivelBateria = num;
    }
}

