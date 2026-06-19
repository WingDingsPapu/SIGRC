import java.io.*;
import java.util.ArrayList;

public class GestorArchivos {

    public void guardarClientes(
            ArrayList<Cliente> clientes,
            String nombreArchivo) {

        try(BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(
                                    nombreArchivo))) {

            for(Cliente cliente : clientes) {

                writer.write(
                        cliente.getCodigo()
                        + ";"
                        + cliente.getNombre()
                        + ";"
                        + cliente.getEmail());

                writer.newLine();
            }

            System.out.println(
                    "Clientes guardados.");

        } catch(IOException e) {

            System.out.println(
                    e.getMessage());
        }
    }

    public ArrayList<Cliente>
    cargarClientes(
            String nombreArchivo) {

        ArrayList<Cliente> clientes =
                new ArrayList<>();

        try(BufferedReader reader =
                    new BufferedReader(
                            new FileReader(
                                    nombreArchivo))) {

            String linea;

            while((linea =
                    reader.readLine()) != null) {

                String[] datos =
                        linea.split(";");

                Cliente cliente =
                        new Cliente(
                                datos[0],
                                datos[1],
                                datos[2]);

                clientes.add(cliente);
            }

        } catch(IOException e) {

            System.out.println(
                    e.getMessage());
        }

        return clientes;
    }
}