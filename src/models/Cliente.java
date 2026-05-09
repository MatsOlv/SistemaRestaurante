package models;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private String historico;

    public Cliente(String nome, String telefone, String cpf, String historico) {
        super(nome, telefone, cpf);
        this.historico = historico;
    }

    public Cliente(String historico) {
        this.historico = historico;
    }

    public Cliente() {
    }

    public static Cliente Cadastrar() {

        Scanner s = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.println("Digite seu nome de usuario:");
        c1.setNome(s.nextLine());
        System.out.println("Digite seu CPF:");
        c1.setCpf(s.nextLine());
        System.out.println("Digite seu Telefone:");
        c1.setTelefone(s.nextLine());
        return c1;
    }
}




