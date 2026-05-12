package erro;

public class ClienteNotFoundException extends Exception {
    public ClienteNotFoundException(String idCliente) {
        super("O cliente" +idCliente+ "não foi encontrado");
    }
}
