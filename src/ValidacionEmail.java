import java.util.regex.Pattern;

public class ValidacionEmail {

    public boolean validarEmail(String email) {

        String regex =
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        return Pattern.matches(regex, email);
    }
}