package Servicios;

public class Servidor {
    private String nombre;
    private String ip;
    private String descripcion;
    private String fechaServicio;
    private boolean web;
    private boolean dns;
    private boolean ftp;
    private int puertoWeb;
    private int puertoDns;
    private int puertoFtp;
    public Servidor(String nombre, String ip, String fechaServicio) {
        this.nombre = nombre;
        this.ip = ip;
        this.descripcion = "Web, Dns y Ftp";
        this.fechaServicio = fechaServicio;
        this.web = true;
        this.dns = true;
        this.ftp = true;
        this.puertoWeb = 80;
        this.puertoDns = 53;
        this.puertoFtp = 21;
    }

    public Servidor(String nombre, String ip, String descripcion, String fechaServicio, boolean web, boolean dns,
                    boolean ftp, int puertoWeb, int puertoDns, int puertoFtp) {
        this.nombre = nombre;
        this.ip = ip;
        this.descripcion = descripcion;
        this.fechaServicio = fechaServicio;
        this.web = web;
        this.dns = dns;
        this.ftp = ftp;
        this.puertoWeb = puertoWeb;
        this.puertoDns = puertoDns;
        this.puertoFtp = puertoFtp;
    }

    public void cambiarEstadoServicio(String servicio, boolean estado) {
        switch (servicio) {
            case "web":
                this.web = estado;
                break;
            case "dns":
                this.dns = estado;
            case "ftp":
                this.dns = estado;
                break;
        }
    }

    public void cambiarPuerto(String servicio, int nuevoPuerto) {
        switch (servicio) {
            case "web":
                this.puertoWeb = nuevoPuerto;
                break;
            case "dns":
                this.puertoDns = nuevoPuerto;
            case "ftp":
                this.puertoFtp = nuevoPuerto;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getIp() {
        return ip;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaServicio() {
        return fechaServicio;
    }

    public boolean isWeb() {
        return web;
    }

    public boolean isDns() {
        return dns;
    }

    public boolean isFtp() {
        return ftp;
    }

    public int getPuertoWeb() {
        return puertoWeb;
    }

    public int getPuertoDns() {
        return puertoDns;
    }

    public int getPuertoFtp() {
        return puertoFtp;
    }

    public String toString() { // Convendría cambiar por un format
        String salida = "Nombre: " + nombre + "\n" +
                        "IP: " + ip + "\n" +
                         "Descripcion: " + descripcion + "\n" +
                        "Fecha de servicio: " + fechaServicio + "\n" +
                        "WEB: " + web + "\n" +
                        "DNS: " + dns + "\n" +
                        "FTP: " + ftp + "\n" +
                        "Puerto Web: " + puertoWeb + "\n" +
                        "Puerto DNS: " + puertoDns + "\n" +
                        "Puerto FTP: " + puertoFtp + "\n";
        return salida;
    }
}
