public class ExamenConducirTeorico {
    private int numFallos;

    public ExamenConducirTeorico (int numFallos) {
        this.numFallos = numFallos;
    }

    public String esApto () {
        if (numFallos <= 3) {
            return "Aprobado!";
        } else {
            return "Suspenso...";
        }
    }
}
