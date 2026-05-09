package models;

public class Cliente extends Pessoa  {
    private String historico;

    public Cliente(String nome, String telefone, String cpf, String historico) {
        super(nome, telefone, cpf);
        this.historico = historico;
    }

    public Cliente(String historico) {
        this.historico = historico;
    }
}

