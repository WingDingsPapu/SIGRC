public class Cliente {

    private String codigo;
    private String nombre;
    private String email;

    public Cliente(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Cliente(String codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}