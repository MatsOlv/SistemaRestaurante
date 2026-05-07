package Exib;

public class Cliente extends Pessoa implements Exibivel {
    private String historico;

    public Cliente(String nome, String telefone, String cpf, String historico) {
        super(nome, telefone, cpf);
        historico = historico;
    }

    public String getHistorico () {
        return historico;
    }

    @Override
    public void exibirDados() {

    }
}