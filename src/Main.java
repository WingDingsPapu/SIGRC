import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final String ARCHIVO =
            "clientes.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorClientes gestor =
                new GestorClientes();

        GestorArchivos gestorArchivos =
                new GestorArchivos();

                ArrayList<Cliente> clientesGuardados =
                gestorArchivos.cargarClientes(
                        ARCHIVO);

                        for(Cliente cliente :
                                clientesGuardados) {

                                        gestor.agregarCliente(cliente);
                                }
        Validaciones validaciones =
                new Validaciones();

        ValidacionEmail validadorEmail =
                new ValidacionEmail();

        ReporteAvanzado reporte =
                new ReporteAvanzado();

        int opcion;

        do {

            System.out.println("\n=================================");
            System.out.println("      SIGRC - UPN");
            System.out.println("Sistema de Gestión de Clientes");
            System.out.println("=================================");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Buscar Cliente por Código");
            System.out.println("3. Buscar Cliente por Nombre");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Actualizar Cliente");
            System.out.println("6. Eliminar Cliente");
            System.out.println("7. Reporte General");
            System.out.println("8. Respaldar Clientes");
            System.out.println("9. Cargar Clientes");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion =
                    Integer.parseInt(
                            sc.nextLine());

            switch(opcion) {

                case 1:

                    registrarCliente(
                            sc,
                            gestor,
                            validaciones,
                            validadorEmail);

                    break;

                case 2:

                    buscarPorCodigo(
                            sc,
                            gestor);

                    break;

                case 3:

                    buscarPorNombre(
                            sc,
                            gestor);

                    break;

                case 4:

                    gestor.mostrarClientes();

                    break;

                case 5:

                    actualizarCliente(
                            sc,
                            gestor);

                    break;

                case 6:

                    eliminarCliente(
                            sc,
                            gestor);

                    break;

                case 7:

                    reporte.generar(gestor);

                    break;

                case 8:

                    gestorArchivos.guardarClientes(
                            gestor.getClientes(),
                            ARCHIVO);

                    break;

                case 9:

                    cargarClientes(
                            gestor,
                            gestorArchivos);

                    break;

                case 0:

                    System.out.println(
                            "\nSaliendo del sistema...");

                    break;

                default:

                    System.out.println(
                            "\nOpción inválida.");
            }

        } while(opcion != 0);

        sc.close();
    }

    private static void registrarCliente(
            Scanner sc,
            GestorClientes gestor,
            Validaciones validaciones,
            ValidacionEmail validadorEmail) {

        System.out.print("\nCódigo: ");
        String codigo =
                sc.nextLine();

        if(!validaciones.validarCodigo(
                codigo)) {

            System.out.println(
                    "Código inválido.");

            return;
        }

        System.out.print("Nombre: ");
        String nombre =
                sc.nextLine();

        System.out.print("Email: ");
        String email =
                sc.nextLine();

        if(!validadorEmail.validarEmail(
                email)) {

            System.out.println(
                    "Email inválido.");

            return;
        }

        Cliente cliente =
                new Cliente(
                        codigo,
                        nombre,
                        email);

        boolean agregado =
                gestor.agregarCliente(
                        cliente);

        if(agregado) {
                GestorArchivos archivos =
                new GestorArchivos();

                archivos.guardarClientes(
                        gestor.getClientes(),
                        ARCHIVO);

            System.out.println(
                    "Cliente registrado correctamente.");

        } else {

            System.out.println(
                    "Ya existe un cliente con ese código.");
        }
    }

    private static void buscarPorCodigo(
            Scanner sc,
            GestorClientes gestor) {

        System.out.print(
                "\nIngrese código: ");

        String codigo =
                sc.nextLine();

        Cliente cliente =
                gestor.buscarPorCodigo(
                        codigo);

        if(cliente == null) {

            System.out.println(
                    "Cliente no encontrado.");

        } else {

            System.out.println(
                    cliente);
        }
    }

    private static void buscarPorNombre(
            Scanner sc,
            GestorClientes gestor) {

        System.out.print(
                "\nIngrese nombre: ");

        String nombre =
                sc.nextLine();

        Cliente cliente =
                gestor.buscarPorNombre(
                        nombre);

        if(cliente == null) {

            System.out.println(
                    "Cliente no encontrado.");

        } else {

            System.out.println(
                    cliente);
        }
    }

    private static void actualizarCliente(
            Scanner sc,
            GestorClientes gestor) {

                ValidacionEmail validador =
            new ValidacionEmail();

        System.out.print(
                "\nCódigo del cliente: ");

        String codigo =
                sc.nextLine();

        System.out.print(
                "Nuevo nombre: ");

        String nombre =
                sc.nextLine();

        System.out.print(
                "Nuevo email: ");

        String email =
                sc.nextLine();

        if(!validador.ValidacionEmail(email)) {
                System.out.println("Email inválido");
                return;
        }        
        
        boolean actualizado =
                gestor.actualizarCliente(
                        codigo,
                        nombre,
                        email);

        if(actualizado) {
                GestorArchivos archivos =
                new GestorArchivos();

                archivos.guardarClientes(
                        gestor.getClientes(),
                        ARCHIVO);
            
            System.out.println(
                    "Cliente actualizado.");

        } else {

            System.out.println(
                    "Cliente no encontrado.");
        }
    }

    private static void eliminarCliente(
            Scanner sc,
            GestorClientes gestor) {

        System.out.print(
                "\nCódigo del cliente: ");

        String codigo =
                sc.nextLine();

        boolean eliminado =
                gestor.eliminarCliente(
                        codigo);

        if(eliminado) {
                GestorArchivos archivos =
                new GestorArchivos();

                archivos.guardarClientes(
                        gestor.getClientes(),
                        ARCHIVO);

            System.out.println(
                    "Cliente eliminado.");

        } else {

            System.out.println(
                    "Cliente no encontrado.");
        }
    }

    private static void cargarClientes(
            GestorClientes gestor,
            GestorArchivos gestorArchivos) {

        ArrayList<Cliente> lista =
                gestorArchivos.cargarClientes(
                        ARCHIVO);

        for(Cliente cliente : lista) {

            gestor.agregarCliente(
                    cliente);
        }

        System.out.println(
                "Clientes cargados correctamente.");
    }
}