import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        GestorClientes gestor =
                new GestorClientes();

        int opcion;

        do {

            System.out.println(
                    "\n===== SIGRC =====");

            System.out.println(
                    "1. Registrar cliente");

            System.out.println(
                    "2. Mostrar clientes");

            System.out.println(
                    "3. Buscar cliente");

            System.out.println(
                    "4. Eliminar cliente");

            System.out.println(
                    "0. Salir");

            opcion =
                    Integer.parseInt(
                            sc.nextLine());

            switch(opcion) {

                case 1:

                    System.out.print(
                            "Codigo: ");

                    String codigo =
                            sc.nextLine();

                    System.out.print(
                            "Nombre: ");

                    String nombre =
                            sc.nextLine();

                    System.out.print(
                            "Email: ");

                    String email =
                            sc.nextLine();

                    gestor.agregarCliente(
                            new Cliente(
                                    codigo,
                                    nombre,
                                    email));

                    break;

                case 2:

                    gestor.mostrarClientes();

                    break;

                case 3:

                    System.out.print(
                            "Codigo: ");

                    Cliente cliente =
                            gestor.buscarPorCodigo(
                                    sc.nextLine());

                    System.out.println(
                            cliente);

                    break;

                case 4:

                    System.out.print(
                            "Codigo: ");

                    gestor.eliminarCliente(
                            sc.nextLine());

                    break;
            }

        } while(opcion != 0);
    }
}