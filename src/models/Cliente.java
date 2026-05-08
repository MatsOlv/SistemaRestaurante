package models;

public class Cliente extends Pessoa implements Exibivel {
    private String historico;

    public Cliente(String nome, String telefone, String cpf, String historico) {
        super(nome, telefone, cpf);
    }
    @Override
    public void exibirDados() { System.out.println("Cliente: " + getNome() + " | CPF: " + cpf + " | Tel: " + getTelefone()); 
                               
}
}
