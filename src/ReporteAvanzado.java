public class ReporteAvanzado {

    public void generar(
            GestorClientes gestor) {

        System.out.println(
                "\n===== REPORTE AVANZADO =====");

        System.out.println(
                "Total de clientes: "
                + gestor.cantidadClientes());

        System.out.println(
                "\nListado de clientes:");

        gestor.mostrarClientes();
    }
}