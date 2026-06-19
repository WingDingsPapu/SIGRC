public class ReporteAvanzado {

    public void generar(
            GestorClientes gestor) {

        System.out.println(
                "\n===== REPORTE AVANZADO =====");

        System.out.println(
                "Cantidad de clientes: "
                + gestor.cantidadClientes());
    }
}