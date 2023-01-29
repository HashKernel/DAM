import java.util.Arrays;
import java.util.Scanner;

public class Club {
    private static Socio[] ArraySocio = new Socio[10];

    public void menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Altas: 1 " + "Bajas: 2 " + "Modificaciones: 3 " + " Consulta: 4 " + " Listados: 5");
        int option = input.nextInt();

        switch (option) {
            case 1:
                alta();
                break;
            case 2:
                bajas();
                break;
            case 3:
                modificaciones();
                break;
            case 4:
                consulta();
                break;
            case 5:
                listados();
                break;
            default:
                System.out.println("Introduce una opción válida");
                break;
        }
    }

    public void alta() {
        Scanner input = new Scanner(System.in);
        int numNulos = 0;

        System.out.println("Introduce un nombre: ");
        String nombre = input.next();

        System.out.println("Introduce tus apellidos: ");
        String apellidos = input.next();

        System.out.println("Fecha de inscripcion: ");
        String fecha = input.next();

        System.out.println("Cuota: ");
        int cuota = input.nextInt();

        // Contabilizar nulos
        for (int i = 0; i < ArraySocio.length; i++) {
            if (ArraySocio[i] != null)
                numNulos++;
        }

        if (numNulos == 10) { // Controlar que no ocurra ArrayIndex out of bounds
            System.out.println("El club está lleno, por favor elimina un integrante antes");
        } else {
            // Crear un nuevo socio
            for (int i = 0; i < ArraySocio.length; i++) {
                if (ArraySocio[i] == null) {
                    ArraySocio[i] = new Socio(nombre, apellidos, fecha, cuota);
                    System.out.println(ArraySocio[i]);
                    break;
                }
            }
        } // else
    } // del método

    public void bajas () {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el id del usuario: ");
        int id = input.nextInt();

        if (id < 0 || id > 9) // Controlar que el id sea un número entre los valores del array
            System.out.println("ID no válido, los valores deben ser entre 0 y 9");
        else
            ArraySocio[id] = null; // Establecer ese indice a nulo
        }

    public void modificaciones() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el id del usuario: ");
        int id = input.nextInt();

        if (id < 0 || id > 9) { // Controlar que el id sea un número entre los valores del array
            System.out.println("ID no válido, los valores deben ser entre 0 y 9");

        } else if (socioNoExiste(id)) { // Controlar que el socio exista
            System.out.println("Ese socio no existe aún");

        } else { // Cambiar cuota del socio

            Socio usuario = ArraySocio[id];

            System.out.println("Cuota actual: " + usuario.getCuota());

            System.out.println("Introduce la nueva cuota: ");
            int nuevaCuota = input.nextInt();

            usuario.setCuota(nuevaCuota);

            System.out.println("Cuota actual: " + usuario.getCuota());
        }
    }

    public void consulta() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el id del usuario: ");
        int id = input.nextInt();

        Socio persona = ArraySocio[id]; // Guardar en una variable el objeto del id especificado

        if (socioNoExiste(id)) // Controlar que el socio existe
            System.out.println("Ese socio no existe aún");
        else
            System.out.println(persona.getApellidos()); // En caso de existir imprimir apellido
    }

    public void listados() {
        Scanner input = new Scanner(System.in);
        int numSocios = 0; // contador

        for (int i = 0; i < ArraySocio.length; i++) { // contabilizar num de socios
            if (ArraySocio[i] != null)
                numSocios++;
        }

        // Input
        System.out.println("general/apellidos");
        String decision = input.next();

        // Si el usuario escribe general imprimir el array entero ignorando nulos
        if (decision.equalsIgnoreCase("general")) {
            for (int i = 0; i < ArraySocio.length; i++) {
                if (socioNoExiste(i)) // Ignoramos nulos
                    continue;
                else // Imprimimos indices con datos
                    System.out.println(ArraySocio[i].toString());
            }

            // Si el usuario escribe apellidos imprimir el array ordenado por apellidos
        } else if (decision.equalsIgnoreCase("apellidos")) {
            for (int i = 0; i < numSocios; i++) { // Desde el indice 0 hasta el último socio
                Arrays.sort(ArraySocio,0,numSocios,Socio.APELLIDOS_COMPARATOR); // Ordenar desde el indice 0 hasta el último socio registrado
                    System.out.println(ArraySocio[i].toString());
            }

        } else
            System.out.println("Opción no válida");
    }

    public boolean socioNoExiste(int id) {
        return ArraySocio[id] == null;
    }
}
