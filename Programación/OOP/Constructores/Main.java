public class Main {
    public static void main(String[] args) {

        Numero num1 = new Numero();
        System.out.println(num1 + " Num1 ");
        num1.suma(4);
        System.out.println(num1 + " Num1 ");

        Numero num2 = new Numero(4);
        System.out.println(num1 + " Num1 ");
        num2.suma(6);
        System.out.println(num2 + " Num2 ");
        num2.resta(3);
        System.out.println(num2 + " Num2 ");

        System.out.println(num2.getDoble());
        num1.setNum(2);
        System.out.println(num1);

        /*ExamenConducirTeorico Antonio = new ExamenConducirTeorico(4);
        System.out.println(Antonio.esApto());
        ExamenConducirTeorico Manuela = new ExamenConducirTeorico(2);
        System.out.println(Manuela.esApto());
        ExamenConducirTeorico Alfonso = new ExamenConducirTeorico(3);
        System.out.println(Alfonso.esApto());*/

        /*Coordenadas cord1 = new Coordenadas(5,2);
        System.out.println(cord1);
        cord1.decreaaseY();
        System.out.println(cord1);
        cord1.decreaaseY();
        System.out.println(cord1);*/
    }
}