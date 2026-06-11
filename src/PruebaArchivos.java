import java.util.ArrayList;

public class PruebaArchivos {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes =
                new ArrayList<>();

        clientes.add(
                new Cliente(
                        "CLI001",
                        "Juan",
                        "juan@gmail.com"));

        clientes.add(
                new Cliente(
                        "CLI002",
                        "Maria",
                        "maria@gmail.com"));

        GestorArchivos gestor =
                new GestorArchivos();

        gestor.guardarClientes(
                clientes,
                "clientes.txt");
    }
}
