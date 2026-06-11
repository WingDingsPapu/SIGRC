public class Validaciones {

    public boolean validarCodigo(String codigo) {

        if(codigo == null || codigo.trim().isEmpty()) {
            return false;
        }

        return codigo.matches("[A-Za-z0-9]+");
    }

}