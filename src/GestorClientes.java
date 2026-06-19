import java.util.ArrayList;

public class GestorClientes {

    private ArrayList<Cliente> clientes =
            new ArrayList<>();

    public boolean agregarCliente(
            Cliente cliente) {

        if(buscarPorCodigo(
                cliente.getCodigo()) != null) {

            return false;
        }

        clientes.add(cliente);

        return true;
    }

    public Cliente buscarPorCodigo(
            String codigo) {

        for(Cliente cliente : clientes) {

            if(cliente.getCodigo()
                    .equalsIgnoreCase(codigo)) {

                return cliente;
            }
        }

        return null;
    }

    public Cliente buscarPorNombre(
            String nombre) {

        for(Cliente cliente : clientes) {

            if(cliente.getNombre()
                    .equalsIgnoreCase(nombre)) {

                return cliente;
            }
        }

        return null;
    }

    public boolean eliminarCliente(
            String codigo) {

        Cliente cliente =
                buscarPorCodigo(codigo);

        if(cliente == null) {
            return false;
        }

        clientes.remove(cliente);

        return true;
    }

    public boolean actualizarCliente(
            String codigo,
            String nuevoNombre,
            String nuevoEmail) {

        Cliente cliente =
                buscarPorCodigo(codigo);

        if(cliente == null) {
            return false;
        }

        cliente.setNombre(nuevoNombre);
        cliente.setEmail(nuevoEmail);

        return true;
    }

    public void mostrarClientes() {

        System.out.println(
                "\n===== CLIENTES =====");

        for(Cliente cliente : clientes) {

            System.out.println(cliente);
        }
    }

    public int cantidadClientes() {

        return clientes.size();
    }

    public ArrayList<Cliente> getClientes() {

        return clientes;
    }
}