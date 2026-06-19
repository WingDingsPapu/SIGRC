public class BusquedaCliente {

    public Cliente buscarCliente(
            GestorClientes gestor,
            String codigo) {

        return gestor.buscarPorCodigo(
                codigo);
    }
}