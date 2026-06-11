import java.util.ArrayList;

public class ReporteClientes {

    public void generarReporte(ArrayList<String> clientes) {

        if(clientes == null){
            System.out.println("No existen clientes.");
            return;
        }

        System.out.println("==== REPORTE DE CLIENTES ====");

        for(String cliente : clientes){
            System.out.println(cliente);
        }
    }
}