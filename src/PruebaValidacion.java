public class PruebaValidacion {

    public static void main(String[] args) {

        try {

            ValidacionEmail validador =
                    new ValidacionEmail();

            boolean valido =
                    validador.validarEmail(
                            "cliente@gmail.com");

            if(!valido) {

                throw new Exception(
                        "Formato de correo inválido");
            }

            System.out.println(
                    "Correo válido");

        } catch(Exception e) {

            System.out.println(
                    "Error detectado: "
                    + e.getMessage());
        }
    }
}