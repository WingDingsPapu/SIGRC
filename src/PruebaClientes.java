public class PruebaClientes {

    public static void main(String[] args) {

        GestorClientes gestor =
                new GestorClientes();

        gestor.agregarCliente(
                new Cliente(
                        "CLI001",
                        "Juan"));

        gestor.agregarCliente(
                new Cliente(
                        "CLI002",
                        "Maria"));

        gestor.agregarCliente(
                new Cliente(
                        "CLI003",
                        "Pedro"));

        gestor.mostrarClientes();

        System.out.println(
                "Total clientes: "
                + gestor.cantidadClientes());
    }
}