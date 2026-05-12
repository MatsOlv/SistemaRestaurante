import models.Cliente;
import java.util.Scanner;

public class Cadastro extends Cliente {

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

    public static void ConsultarCadastro (Cliente c1) {

        if (c1 == null) {
            System.out.println("Não há cadastros aqui");
        } else {
            System.out.println(
                    "--------------------\n" +
                            "Nome: " + c1.getNome() + "\n" +
                            "Cpf: " + c1.getCpf() + "\n" +
                            "Telefone: " + c1.getTelefone() + "\n" +
                            "--------------------\n"
            );
        }
    }
}
