public class Main {
    public static void main(String[] args) {
        AutomovilCEI tesla = new AutomovilCEI("JTT2664",70000,32561);

        System.out.println(tesla.getNivelBateria());
        System.out.println(tesla.getPorcentajeBateria());

        for (int i = 0; i < 30000; i++) {
            tesla.utilizarEnergia();
        }
        
        System.out.println(tesla.getNivelBateria());
        System.out.println(tesla.getPorcentajeBateria());

    }
}