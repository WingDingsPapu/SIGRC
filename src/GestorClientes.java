import java.util.ArrayList;

public class GestorClientes {

    private ArrayList<Cliente> clientes =
            new ArrayList<>();

    public void agregarCliente(
            Cliente cliente) {

        clientes.add(cliente);
    }

    public void mostrarClientes() {

        for(Cliente cliente : clientes) {

            System.out.println(
                    cliente.getCodigo()
                    + " - "
                    + cliente.getNombre());
        }
    }

    public int cantidadClientes() {

        return clientes.size();
    }
}