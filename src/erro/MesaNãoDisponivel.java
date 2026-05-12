package erro;

public class MesaNãoDisponivel extends RuntimeException {
    public MesaNãoDisponivel(String message) {
        super("Mesa não dispnivel");
    }
}
