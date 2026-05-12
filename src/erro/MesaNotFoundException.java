package erro;

public class MesaNotFoundException extends RuntimeException {
    public MesaNotFoundException(String message) {
        super("Mesa não encontrada");
    }
}
