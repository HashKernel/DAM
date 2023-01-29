import java.util.Scanner;
import java.util.Comparator;

public class Socio implements Comparable<Socio> {

    // Atributos
    private String nombre;
    private String apellidos;
    private String fecha;
    private float cuota;
    private int id;

    // Constructor
    public Socio(String nombre, String apellidos, String fecha, float cuota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public float getCuota() {
        return cuota;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Apellidos: " + this.apellidos + " Fecha: " + this.fecha + " Cuota " + this.cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public static Comparator<Socio> APELLIDOS_COMPARATOR = new Comparator<Socio>() {

        public int compare(Socio socio1, Socio socio2) {
            return socio1.apellidos.compareTo(socio2.apellidos);
        }
    };

    @Override
    public int compareTo(Socio o) {
        return 0;
    }
}

