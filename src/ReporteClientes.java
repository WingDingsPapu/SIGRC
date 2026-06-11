import java.util.ArrayList;

public class ReporteClientes {

    public void generarReporte(ArrayList<String> clientes) {

        System.out.println("==== REPORTE DE CLIENTES ====");

        for(String cliente : clientes){
            System.out.println(cliente);
        }
    }
}