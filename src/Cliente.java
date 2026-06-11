public class Cliente {

    private String codigo;
    private String nombreCliente;

    public Cliente(String codigo, String nombreCliente) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombreCliente);
    }
}