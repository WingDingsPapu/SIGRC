import java.io.*;
import java.util.ArrayList;

public class GestorArchivos {

    public void guardarClientes(
            ArrayList<Cliente> clientes,
            String nombreArchivo) {

        try (BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(nombreArchivo))) {

            for (Cliente cliente : clientes) {

                writer.write(
                        cliente.getCodigo()
                        + ";"
                        + cliente.getNombre()
                        + ";"
                        + cliente.getEmail());

                writer.newLine();
            }

            System.out.println(
                    "Clientes guardados correctamente.");

        } catch(IOException e) {

            System.out.println(
                    "Error al guardar archivo: "
                    + e.getMessage());
        }
    }
}
