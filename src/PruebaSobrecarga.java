public class PruebaSobrecarga {

    public static void main(String[] args) {

        Cliente cliente1 =
                new Cliente(
                        "CLI001",
                        "Juan");

        Cliente cliente2 =
                new Cliente(
                        "CLI002",
                        "Maria",
                        "maria@gmail.com");

        System.out.println(
                "Sobrecarga ejecutada correctamente");
    }
}